// Generated by Dagger (https://dagger.dev).
package assignment.com.smsapplication.sms.presenter;

import assignment.com.smsapplication.utils.SmsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SmsPresenter_Factory implements Factory<SmsPresenter> {
  private final Provider<SmsRepository> smsRepositoryProvider;

  public SmsPresenter_Factory(Provider<SmsRepository> smsRepositoryProvider) {
    this.smsRepositoryProvider = smsRepositoryProvider;
  }

  @Override
  public SmsPresenter get() {
    return newInstance(smsRepositoryProvider.get());
  }

  public static SmsPresenter_Factory create(Provider<SmsRepository> smsRepositoryProvider) {
    return new SmsPresenter_Factory(smsRepositoryProvider);
  }

  public static SmsPresenter newInstance(SmsRepository smsRepository) {
    return new SmsPresenter(smsRepository);
  }
}
