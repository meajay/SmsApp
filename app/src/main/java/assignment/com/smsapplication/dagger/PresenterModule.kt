package assignment.com.smsapplication.dagger

import android.content.Context
import assignment.com.smsapplication.dagger.qualifier.ApplicationContext
import assignment.com.smsapplication.dagger.scope.AppScope
import assignment.com.smsapplication.sms.presenter.SmsPresenter
import assignment.com.smsapplication.utils.SmsAPI
import dagger.Module
import dagger.Provides

@Module
class PresenterModule {
    @Provides
    @AppScope
    fun provideSmsAPI(@ApplicationContext context: Context): SmsAPI {
        return SmsAPI(context)
    }

    @Provides
    @AppScope
    fun provideWeatherPresenter(smsAPI: SmsAPI): SmsPresenter {
        return SmsPresenter(smsAPI)
    }
}