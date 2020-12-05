package assignment.com.smsapplication

import android.app.Application
import assignment.com.smsapplication.dagger.AppComponent
import assignment.com.smsapplication.dagger.AppModule
import assignment.com.smsapplication.dagger.DaggerAppComponent
import assignment.com.smsapplication.dagger.PresenterModule

class SmsApp : Application() {
    private var appComponent: AppComponent? = null
    override fun onCreate() {
        super.onCreate()
        initAppComponent()?.inject(this)
    }

    override fun onTerminate() {
        super.onTerminate()
    }

    fun initAppComponent(): AppComponent? {
        if (appComponent == null) {
            appComponent = DaggerAppComponent
                    .builder().appModule(AppModule(this))
                    .presenterModule(PresenterModule())
                    .build()
        }
        return appComponent
    }

    fun getAppComponent(): AppComponent? {
        return appComponent
    }
}