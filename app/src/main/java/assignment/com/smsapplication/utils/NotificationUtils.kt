package assignment.com.smsapplication.utils

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.media.RingtoneManager
import android.net.Uri
import android.os.Build
import androidx.core.app.NotificationCompat
import assignment.com.smsapplication.R
import assignment.com.smsapplication.constants.AppConstants
import assignment.com.smsapplication.sms.view.SmsActivity

class NotificationUtils(private val context: Context) {
    private var notificationManager: NotificationManager? = null
    fun showNotificationMessages(title: String?, message: String?, time: String?) {
        val icon = R.drawable.ic_textsms
        val resultIntent = Intent(context, SmsActivity::class.java)
        resultIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or
                Intent.FLAG_ACTIVITY_SINGLE_TOP
        resultIntent.putExtra(AppConstants.ADDRESS, title)
        resultIntent.putExtra(AppConstants.MESSAGE, message)
        resultIntent.putExtra(AppConstants.TIMESTAMP, time)
        val pendingIntent = PendingIntent.getActivity(context, 0, resultIntent,
                PendingIntent.FLAG_CANCEL_CURRENT)
        val mBuilder = NotificationCompat.Builder(context)
        showSmallNotification(mBuilder, icon, title, message, pendingIntent)
        playNotificationSound()
    }

    private fun showSmallNotification(mBuilder: NotificationCompat.Builder, icon: Int, title: String?,
                                      message: String?, resultPendingIntent: PendingIntent) {
        val CHANNEL_ID = "SMS_APP"
        val name: CharSequence = "New-Sms"
        val importance = NotificationManager.IMPORTANCE_HIGH
        var channel: NotificationChannel? = null
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            channel = NotificationChannel(CHANNEL_ID, name, importance)
        }
        val inboxStyle = NotificationCompat.InboxStyle()
        inboxStyle.addLine(message)
        val notification: Notification
        notification = mBuilder.setSmallIcon(icon).setTicker(title).setWhen(System.currentTimeMillis())
                .setContentTitle(title)
                .setAutoCancel(true)
                .setContentIntent(resultPendingIntent)
                .setStyle(inboxStyle)
                .setPriority(Notification.PRIORITY_MAX)
                 .setVibrate(longArrayOf(0))
                .setChannelId(CHANNEL_ID)
                .setLargeIcon(BitmapFactory.decodeResource(context.resources, icon))
                .setContentText(message)
                .build()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notificationManager!!.createNotificationChannel(channel!!)
        }
        notificationManager!!.notify(AppConstants.NOTIFICATION_ID_SMALL, notification)
    }

    private fun playNotificationSound() {
        try {
            val alarmSound = Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE
                    + "://" + context.packageName + "/raw/notification")
            val r = RingtoneManager.getRingtone(context, alarmSound)
            r.play()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    companion object {
        private val TAG = NotificationUtils::class.java.simpleName
    }

    init {
        if (notificationManager == null) {
            notificationManager = context
                    .getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        }
    }
}