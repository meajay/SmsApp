package assignment.com.smsapplication.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lassignment/com/smsapplication/dagger/AppComponent;", "", "inject", "", "smsApp", "Lassignment/com/smsapplication/SmsApp;", "smsActivity", "Lassignment/com/smsapplication/sms/view/SmsActivity;", "app_debug"})
@dagger.Component(modules = {assignment.com.smsapplication.dagger.AppModule.class, assignment.com.smsapplication.dagger.PresenterModule.class})
@assignment.com.smsapplication.dagger.scope.AppScope()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.Nullable()
    assignment.com.smsapplication.SmsApp smsApp);
    
    public abstract void inject(@org.jetbrains.annotations.Nullable()
    assignment.com.smsapplication.sms.view.SmsActivity smsActivity);
}