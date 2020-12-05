package assignment.com.smsapplication.sms.view

import assignment.com.smsapplication.base.BaseViewContract
import assignment.com.smsapplication.sms.model.Sms

interface SmsMvpView : BaseViewContract {
    fun onGetInboxMessagesResponse(result: Int, smsList: List<Sms?>?, message: String?)
}