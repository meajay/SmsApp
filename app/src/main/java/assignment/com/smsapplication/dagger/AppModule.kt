package assignment.com.smsapplication.dagger

import android.app.Application
import android.content.Context
import assignment.com.smsapplication.dagger.qualifier.ApplicationContext
import assignment.com.smsapplication.dagger.scope.AppScope
import assignment.com.smsapplication.utils.AppPermissions
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val application: Application) {
    @Provides
    @AppScope
    fun providesApplication(): Application {
        return application
    }

    @Provides
    @ApplicationContext
    @AppScope
    fun provideContext(): Context {
        return application.baseContext
    }

}