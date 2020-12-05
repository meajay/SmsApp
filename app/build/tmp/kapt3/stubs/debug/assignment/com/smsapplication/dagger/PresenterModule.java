package assignment.com.smsapplication.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lassignment/com/smsapplication/dagger/PresenterModule;", "", "()V", "provideSmsAPI", "Lassignment/com/smsapplication/utils/SmsAPI;", "context", "Landroid/content/Context;", "provideWeatherPresenter", "Lassignment/com/smsapplication/sms/presenter/SmsPresenter;", "smsAPI", "app_debug"})
@dagger.Module()
public final class PresenterModule {
    
    @org.jetbrains.annotations.NotNull()
    @assignment.com.smsapplication.dagger.scope.AppScope()
    @dagger.Provides()
    public final assignment.com.smsapplication.utils.SmsAPI provideSmsAPI(@org.jetbrains.annotations.NotNull()
    @assignment.com.smsapplication.dagger.qualifier.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @assignment.com.smsapplication.dagger.scope.AppScope()
    @dagger.Provides()
    public final assignment.com.smsapplication.sms.presenter.SmsPresenter provideWeatherPresenter(@org.jetbrains.annotations.NotNull()
    assignment.com.smsapplication.utils.SmsAPI smsAPI) {
        return null;
    }
    
    public PresenterModule() {
        super();
    }
}