package assignment.com.smsapplication.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lassignment/com/smsapplication/dagger/AppModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "provideContext", "Landroid/content/Context;", "providesApplication", "app_debug"})
@dagger.Module()
public final class AppModule {
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    @assignment.com.smsapplication.dagger.scope.AppScope()
    @dagger.Provides()
    public final android.app.Application providesApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @assignment.com.smsapplication.dagger.scope.AppScope()
    @assignment.com.smsapplication.dagger.qualifier.ApplicationContext()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}