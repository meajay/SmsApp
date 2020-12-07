package assignment.com.smsapplication.sms.presenter

import assignment.com.smsapplication.base.BasePresenter
import assignment.com.smsapplication.constants.AppConstants
import assignment.com.smsapplication.sms.view.SmsMvpView
import assignment.com.smsapplication.utils.SmsRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class SmsPresenter  @Inject constructor(
        var smsRepository: SmsRepository): BasePresenter<SmsMvpView?>(), SmsMvpPresenter {


    override fun allInBoxMessages(reset : Boolean) {
        val d: Disposable = smsRepository.fetchAllInboxSms(reset).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe({ smsResponse ->
                    view?.onGetInboxMessagesResponse(AppConstants.SUCCESS,
                            smsResponse.smsList, "success")
                }, { throwable ->
                    view?.onGetInboxMessagesResponse(AppConstants.ERROR, null,
                            throwable.message)
                })
    }
}