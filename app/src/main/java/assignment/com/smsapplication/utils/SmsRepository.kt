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
    private var countNumber = 0
    private var loopCounter = 0
    private var totalSMS = 0
    private var hourCounter = -1
    private var dayNotSelected = true
    fun fetchAllInboxSms(resetAll : Boolean): Observable<SmsResponse> {
        val cr = context.contentResolver
        val c = cr.query(Telephony.Sms.Inbox.CONTENT_URI, null, null,
                null, Telephony.Sms.Inbox.DEFAULT_SORT_ORDER)
        val smsList: MutableList<Sms> = ArrayList()
        if(resetAll){
            loopCounter = 0
            hourCounter = -1
            dayNotSelected = true
            countNumber = 0
        }
        else {
            loopCounter = countNumber
        }
        countNumber += 15
        if (c != null) {

            totalSMS = c.count
            if (c.moveToPosition(loopCounter)) {
                while(loopCounter  < countNumber) {
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
        if (dayNotSelected) {
            val diff = System.currentTimeMillis() - java.lang.Long.valueOf(time)
            val hours = ( diff / (60000 * 60) ).toInt()
            if(hours==0 && hourCounter!=hours){
                hourCounter = hours
                return "Latest"
            }
            if (hours in 1..12 && hourCounter!=hours ) {
                hourCounter = hours
                return "$hours hours ago"
            } else if (hours > 24 && dayNotSelected) {
                dayNotSelected = false
                return 1.toString() + " day ago"
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