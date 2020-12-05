// Generated by Dagger (https://dagger.dev).
package assignment.com.smsapplication.sms.view;

import assignment.com.smsapplication.sms.presenter.SmsPresenter;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SmsActivity_MembersInjector implements MembersInjector<SmsActivity> {
  private final Provider<SmsPresenter> smsPresenterProvider;

  public SmsActivity_MembersInjector(Provider<SmsPresenter> smsPresenterProvider) {
    this.smsPresenterProvider = smsPresenterProvider;
  }

  public static MembersInjector<SmsActivity> create(Provider<SmsPresenter> smsPresenterProvider) {
    return new SmsActivity_MembersInjector(smsPresenterProvider);}

  @Override
  public void injectMembers(SmsActivity instance) {
    injectSmsPresenter(instance, smsPresenterProvider.get());
  }

  @InjectedFieldSignature("assignment.com.smsapplication.sms.view.SmsActivity.smsPresenter")
  public static void injectSmsPresenter(SmsActivity instance, SmsPresenter smsPresenter) {
    instance.smsPresenter = smsPresenter;
  }
}