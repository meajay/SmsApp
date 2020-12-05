package assignment.com.smsapplication.sms.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000b"}, d2 = {"Lassignment/com/smsapplication/sms/view/SmsMvpView;", "Lassignment/com/smsapplication/base/BaseViewContract;", "onGetInboxMessagesResponse", "", "result", "", "smsList", "", "Lassignment/com/smsapplication/sms/model/Sms;", "message", "", "app_debug"})
public abstract interface SmsMvpView extends assignment.com.smsapplication.base.BaseViewContract {
    
    public abstract void onGetInboxMessagesResponse(int result, @org.jetbrains.annotations.Nullable()
    java.util.List<assignment.com.smsapplication.sms.model.Sms> smsList, @org.jetbrains.annotations.Nullable()
    java.lang.String message);
}