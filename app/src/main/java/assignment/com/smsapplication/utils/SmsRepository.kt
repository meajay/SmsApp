package assignment.com.smsapplication.utils

import android.content.Context
import android.provider.Telephony
import android.util.Log
import android.widget.Toast
import assignment.com.smsapplication.sms.model.Sms
import assignment.com.smsapplication.sms.model.SmsResponse
import io.reactivex.Observable
import java.util.*
import javax.inject.Singleton


class SmsRepository(private val context: Context) {
    private var currentTime = 0L
    private var countNumber = 0
    private var countHoursAgo = true
    private var loopCounter = 0
    private var totalSMS = 0
    fun fetchAllInboxSms(): Observable<SmsResponse> {
        val cr = context.contentResolver
        val c = cr.query(Telephony.Sms.Inbox.CONTENT_URI, null, null,
                null, Telephony.Sms.Inbox.DEFAULT_SORT_ORDER)
        val smsList: MutableList<Sms> = ArrayList()
        currentTime = System.currentTimeMillis()
        loopCounter = countNumber
        countNumber += 15
        val localCount = countNumber
        countHoursAgo = true
        if (c != null) {

            totalSMS = c.count
            if (c.moveToPosition(loopCounter)) {
                while(loopCounter  < localCount) {
                    val sms = Sms()
                    sms.date = c.getString(c.getColumnIndexOrThrow(Telephony.Sms.Inbox.DATE))
                    sms.sender = c.getString(c.getColumnIndexOrThrow(Telephony.Sms.Inbox.ADDRESS))
                    sms.message = c.getString(c.getColumnIndexOrThrow(Telephony.Sms.Inbox.BODY))
                    sms.read = c.getString(c.getColumnIndexOrThrow(Telephony.Sms.Inbox.READ))
                    val hourAgo = getHoursAgo(c.getString(c.getColumnIndexOrThrow(Telephony.Sms.Inbox.DATE)))
                    sms.hoursAgo = hourAgo
                    c.moveToNext()
                    smsList.add(sms)
                    loopCounter++
                    if(loopCounter>=totalSMS){
                        break
                    }
                }
            }
            c.close()
        } else {
            Toast.makeText(context, "No message to show!", Toast.LENGTH_SHORT).show()
        }
        return getSmsResponse(smsList)
    }

    private fun getHoursAgo(time: String): String {
        if (countHoursAgo) {
            val diff = currentTime - java.lang.Long.valueOf(time)
            val hours = diff.toInt() / (60000 * 60)
            if (hours < 13 && countNumber != hours) {
                countNumber = hours
                return hours.toString() + "hours ago"
            } else if (hours > 24 && countNumber != hours) {
                countHoursAgo = false
                return 1.toString() + "day ago"
            }
        }
        return ""
    }

    private fun getSmsResponse(smsList: List<Sms>): Observable<SmsResponse> {
        val smsResponse = SmsResponse()
        smsResponse.smsList = smsList
        return Observable.just(smsResponse)
    }

}