package assignment.com.smsapplication.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u001c\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR*\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u0000@DX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lassignment/com/smsapplication/base/BasePresenter;", "V", "Lassignment/com/smsapplication/base/BaseViewContract;", "Lassignment/com/smsapplication/base/BasePresenterContract;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "isViewAttached", "", "()Z", "<set-?>", "view", "getView", "()Lassignment/com/smsapplication/base/BaseViewContract;", "setView", "(Lassignment/com/smsapplication/base/BaseViewContract;)V", "Lassignment/com/smsapplication/base/BaseViewContract;", "onAttach", "", "onDetach", "app_debug"})
public class BasePresenter<V extends assignment.com.smsapplication.base.BaseViewContract> implements assignment.com.smsapplication.base.BasePresenterContract<V> {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.Nullable()
    private V view;
    
    protected final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final V getView() {
        return null;
    }
    
    protected final void setView(@org.jetbrains.annotations.Nullable()
    V p0) {
    }
    
    @java.lang.Override()
    public void onAttach(V view) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public final boolean isViewAttached() {
        return false;
    }
    
    public BasePresenter() {
        super();
    }
}