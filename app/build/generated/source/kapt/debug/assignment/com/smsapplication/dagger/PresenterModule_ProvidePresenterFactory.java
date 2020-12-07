// Generated by Dagger (https://dagger.dev).
package assignment.com.smsapplication.dagger;

import assignment.com.smsapplication.sms.presenter.SmsPresenter;
import assignment.com.smsapplication.utils.SmsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PresenterModule_ProvidePresenterFactory implements Factory<SmsPresenter> {
  private final PresenterModule module;

  private final Provider<SmsRepository> smsRepositoryProvider;

  public PresenterModule_ProvidePresenterFactory(PresenterModule module,
      Provider<SmsRepository> smsRepositoryProvider) {
    this.module = module;
    this.smsRepositoryProvider = smsRepositoryProvider;
  }

  @Override
  public SmsPresenter get() {
    return providePresenter(module, smsRepositoryProvider.get());
  }

  public static PresenterModule_ProvidePresenterFactory create(PresenterModule module,
      Provider<SmsRepository> smsRepositoryProvider) {
    return new PresenterModule_ProvidePresenterFactory(module, smsRepositoryProvider);
  }

  public static SmsPresenter providePresenter(PresenterModule instance,
      SmsRepository smsRepository) {
    return Preconditions.checkNotNull(instance.providePresenter(smsRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
