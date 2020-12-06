package assignment.com.smsapplication.dagger

import assignment.com.smsapplication.SmsApp
import assignment.com.smsapplication.dagger.scope.AppScope
import assignment.com.smsapplication.sms.view.SmsActivity
import dagger.Component

@AppScope
@Component(modules = [AppModule::class, PresenterModule::class])
interface AppComponent {
    fun inject(smsApp: SmsApp?)
    fun inject(smsActivity: SmsActivity?)
}