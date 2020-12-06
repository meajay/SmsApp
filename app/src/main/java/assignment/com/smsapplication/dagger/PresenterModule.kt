package assignment.com.smsapplication.dagger

import android.content.Context
import assignment.com.smsapplication.dagger.qualifier.ApplicationContext
import assignment.com.smsapplication.dagger.scope.AppScope
import assignment.com.smsapplication.sms.presenter.SmsPresenter
import assignment.com.smsapplication.utils.SmsRepository
import dagger.Module
import dagger.Provides

@Module
class PresenterModule {
    @Provides
    @AppScope
    fun provideSmsAPI(@ApplicationContext context: Context): SmsRepository {
        return SmsRepository(context)
    }

    @Provides
    @AppScope
    fun providePresenter(smsRepository: SmsRepository): SmsPresenter {
        return SmsPresenter(smsRepository)
    }
}