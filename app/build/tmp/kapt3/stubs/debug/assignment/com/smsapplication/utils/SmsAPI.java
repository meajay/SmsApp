package assignment.com.smsapplication.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lassignment/com/smsapplication/utils/SmsAPI;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "count", "", "countHoursAgo", "", "currentTime", "", "fetchAllInboxSms", "Lio/reactivex/Observable;", "Lassignment/com/smsapplication/sms/model/SmsResponse;", "getHoursAgo", "", "time", "getSmsResponse", "smsList", "", "Lassignment/com/smsapplication/sms/model/Sms;", "app_debug"})
public final class SmsAPI {
    private long currentTime;
    private int count;
    private boolean countHoursAgo;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<assignment.com.smsapplication.sms.model.SmsResponse> fetchAllInboxSms() {
        return null;
    }
    
    private final java.lang.String getHoursAgo(java.lang.String time) {
        return null;
    }
    
    private final io.reactivex.Observable<assignment.com.smsapplication.sms.model.SmsResponse> getSmsResponse(java.util.List<assignment.com.smsapplication.sms.model.Sms> smsList) {
        return null;
    }
    
    public SmsAPI(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}