// Generated by Dagger (https://dagger.dev).
package assignment.com.smsapplication.dagger;

import android.content.Context;
import assignment.com.smsapplication.utils.SmsAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PresenterModule_ProvideSmsAPIFactory implements Factory<SmsAPI> {
  private final PresenterModule module;

  private final Provider<Context> contextProvider;

  public PresenterModule_ProvideSmsAPIFactory(PresenterModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SmsAPI get() {
    return provideSmsAPI(module, contextProvider.get());
  }

  public static PresenterModule_ProvideSmsAPIFactory create(PresenterModule module,
      Provider<Context> contextProvider) {
    return new PresenterModule_ProvideSmsAPIFactory(module, contextProvider);
  }

  public static SmsAPI provideSmsAPI(PresenterModule instance, Context context) {
    return Preconditions.checkNotNull(instance.provideSmsAPI(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
