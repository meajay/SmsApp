// Generated by Dagger (https://dagger.dev).
package assignment.com.smsapplication.dagger;

import assignment.com.smsapplication.sms.presenter.SmsPresenter;
import assignment.com.smsapplication.utils.SmsAPI;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PresenterModule_ProvideWeatherPresenterFactory implements Factory<SmsPresenter> {
  private final PresenterModule module;

  private final Provider<SmsAPI> smsAPIProvider;

  public PresenterModule_ProvideWeatherPresenterFactory(PresenterModule module,
      Provider<SmsAPI> smsAPIProvider) {
    this.module = module;
    this.smsAPIProvider = smsAPIProvider;
  }

  @Override
  public SmsPresenter get() {
    return provideWeatherPresenter(module, smsAPIProvider.get());
  }

  public static PresenterModule_ProvideWeatherPresenterFactory create(PresenterModule module,
      Provider<SmsAPI> smsAPIProvider) {
    return new PresenterModule_ProvideWeatherPresenterFactory(module, smsAPIProvider);
  }

  public static SmsPresenter provideWeatherPresenter(PresenterModule instance, SmsAPI smsAPI) {
    return Preconditions.checkNotNull(instance.provideWeatherPresenter(smsAPI), "Cannot return null from a non-@Nullable @Provides method");
  }
}
