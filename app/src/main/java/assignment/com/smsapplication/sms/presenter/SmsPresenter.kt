package assignment.com.smsapplication.sms.presenter

import assignment.com.smsapplication.base.BasePresenter
import assignment.com.smsapplication.constants.AppConstants
import assignment.com.smsapplication.sms.view.SmsMvpView
import assignment.com.smsapplication.utils.SmsAPI
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class SmsPresenter(smsAPI: SmsAPI) : BasePresenter<SmsMvpView?>(), SmsMvpPresenter {
    private val smsAPI: SmsAPI
    override val allInBoxMessages: Unit
        get() {
            val d: Disposable = smsAPI.fetchAllInboxSms().subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread()).subscribe({ smsResponse ->
                        view?.onGetInboxMessagesResponse(AppConstants.SUCCESS,
                                smsResponse.smsList, "success")
                    }, { throwable ->
                        view?.onGetInboxMessagesResponse(AppConstants.ERROR, null,
                                throwable.message)
                    })
        }

    init {
        this.smsAPI = smsAPI
    }
}