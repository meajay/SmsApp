package assignment.com.smsapplication.sms.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lassignment/com/smsapplication/sms/presenter/SmsPresenter;", "Lassignment/com/smsapplication/base/BasePresenter;", "Lassignment/com/smsapplication/sms/view/SmsMvpView;", "Lassignment/com/smsapplication/sms/presenter/SmsMvpPresenter;", "smsRepository", "Lassignment/com/smsapplication/utils/SmsRepository;", "(Lassignment/com/smsapplication/utils/SmsRepository;)V", "getSmsRepository", "()Lassignment/com/smsapplication/utils/SmsRepository;", "setSmsRepository", "allInBoxMessages", "", "reset", "", "app_debug"})
public final class SmsPresenter extends assignment.com.smsapplication.base.BasePresenter<assignment.com.smsapplication.sms.view.SmsMvpView> implements assignment.com.smsapplication.sms.presenter.SmsMvpPresenter {
    @org.jetbrains.annotations.NotNull()
    private assignment.com.smsapplication.utils.SmsRepository smsRepository;
    
    @java.lang.Override()
    public void allInBoxMessages(boolean reset) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final assignment.com.smsapplication.utils.SmsRepository getSmsRepository() {
        return null;
    }
    
    public final void setSmsRepository(@org.jetbrains.annotations.NotNull()
    assignment.com.smsapplication.utils.SmsRepository p0) {
    }
    
    @javax.inject.Inject()
    public SmsPresenter(@org.jetbrains.annotations.NotNull()
    assignment.com.smsapplication.utils.SmsRepository smsRepository) {
        super();
    }
}