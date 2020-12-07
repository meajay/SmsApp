package assignment.com.smsapplication.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.telephony.SmsMessage
import android.util.Log
import assignment.com.smsapplication.utils.NotificationUtils
import assignment.com.smsapplication.utils.SharedPrefUtils

class SmsReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val bundle = intent.extras
        SharedPrefUtils.setResetValue(context,true)
        val msgs: Array<SmsMessage?>
        val format = bundle!!.getString("format")
        val pdus = bundle["pdus"] as Array<*>?
        if (pdus != null) {
            val isVersionM = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
            msgs = arrayOfNulls(pdus.size)
            for (i in msgs.indices) {
                if (isVersionM) {
                    msgs[i] = SmsMessage.createFromPdu(pdus[i] as ByteArray, format)
                } else {
                    msgs[i] = SmsMessage.createFromPdu(pdus[i] as ByteArray)
                }
                val address = msgs[i]?.originatingAddress
                val messsage = msgs[i]?.messageBody
                val time = "" + msgs[i]?.timestampMillis
                Log.d(TAG, "onReceive: $messsage")
                if (messsage != null) {
                    showNotificationMessage(context, address, messsage, time)
                }
            }
        }
    }

    private fun showNotificationMessage(context: Context, title: String?, message: String, time: String) {
        val notificationUtils = NotificationUtils(context)
        notificationUtils.showNotificationMessages(title, message, time)
    }

    companion object {
        val TAG = BroadcastReceiver::class.java.simpleName
    }
}