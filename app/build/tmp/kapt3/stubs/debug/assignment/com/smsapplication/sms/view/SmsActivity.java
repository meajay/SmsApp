package assignment.com.smsapplication.sms.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J,\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u001e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016J\u001e\u0010#\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00192\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016J+\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0&2\u0006\u0010\'\u001a\u00020(H\u0016\u00a2\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0011H\u0002J\b\u0010+\u001a\u00020\u0011H\u0002J\u0018\u0010,\u001a\u00020\u00112\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u001aR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lassignment/com/smsapplication/sms/view/SmsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lassignment/com/smsapplication/sms/view/SmsMvpView;", "Lpub/devrel/easypermissions/EasyPermissions$PermissionCallbacks;", "()V", "appPermissions", "Lassignment/com/smsapplication/utils/AppPermissions;", "smsAdapter", "Lassignment/com/smsapplication/sms/view/SmsAdapter;", "smsList", "", "Lassignment/com/smsapplication/sms/model/Sms;", "smsPresenter", "Lassignment/com/smsapplication/sms/presenter/SmsPresenter;", "smsRecycler", "Lcom/cooltechworks/views/shimmer/ShimmerRecyclerView;", "checkAndRequestSMSPermission", "", "fetchInBoxMessages", "injectDependencies", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetInboxMessagesResponse", "result", "", "", "message", "", "onNewIntent", "intent", "Landroid/content/Intent;", "onPermissionsDenied", "requestCode", "perms", "onPermissionsGranted", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestSmsPermission", "setUpRecyclerView", "updateAdapter", "app_debug"})
public final class SmsActivity extends androidx.appcompat.app.AppCompatActivity implements assignment.com.smsapplication.sms.view.SmsMvpView, pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks {
    @org.jetbrains.annotations.Nullable()
    @butterknife.BindView(value = assignment.com.smsapplication.R.id.sms_recycler)
    public com.cooltechworks.views.shimmer.ShimmerRecyclerView smsRecycler;
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Inject()
    public assignment.com.smsapplication.sms.presenter.SmsPresenter smsPresenter;
    private assignment.com.smsapplication.utils.AppPermissions appPermissions;
    private assignment.com.smsapplication.sms.view.SmsAdapter smsAdapter;
    private final java.util.List<assignment.com.smsapplication.sms.model.Sms> smsList = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onPermissionsGranted(int requestCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perms) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onPermissionsDenied(int requestCode, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> perms) {
    }
    
    @java.lang.Override()
    public void onGetInboxMessagesResponse(int result, @org.jetbrains.annotations.Nullable()
    java.util.List<assignment.com.smsapplication.sms.model.Sms> smsList, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void updateAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<assignment.com.smsapplication.sms.model.Sms> smsList) {
    }
    
    private final void checkAndRequestSMSPermission() {
    }
    
    private final void fetchInBoxMessages() {
    }
    
    private final void injectDependencies() {
    }
    
    private final void requestSmsPermission() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    public SmsActivity() {
        super();
    }
}