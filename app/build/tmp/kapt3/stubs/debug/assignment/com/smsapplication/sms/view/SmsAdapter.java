package assignment.com.smsapplication.sms.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\nH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lassignment/com/smsapplication/sms/view/SmsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lassignment/com/smsapplication/sms/view/SmsAdapter$SmsViewHolder;", "context", "Landroid/content/Context;", "smsList", "", "Lassignment/com/smsapplication/sms/model/Sms;", "(Landroid/content/Context;Ljava/util/List;)V", "count", "", "currentTime", "", "timeFlag", "", "getItemCount", "onBindViewHolder", "", "smsViewHolder", "i", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "SmsViewHolder", "app_debug"})
public final class SmsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<assignment.com.smsapplication.sms.view.SmsAdapter.SmsViewHolder> {
    private final long currentTime = 0L;
    private final boolean timeFlag = true;
    private final int count = 1;
    private final android.content.Context context = null;
    private final java.util.List<assignment.com.smsapplication.sms.model.Sms> smsList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public assignment.com.smsapplication.sms.view.SmsAdapter.SmsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int i) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    assignment.com.smsapplication.sms.view.SmsAdapter.SmsViewHolder smsViewHolder, int i) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public SmsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<assignment.com.smsapplication.sms.model.Sms> smsList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lassignment/com/smsapplication/sms/view/SmsAdapter$SmsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lassignment/com/smsapplication/sms/view/SmsAdapter;Landroid/view/View;)V", "message", "Landroid/widget/TextView;", "senderDetail", "senderInitial", "senderTag", "Landroidx/cardview/widget/CardView;", "timeElapsed", "unreadTag", "setViewData", "", "sms", "Lassignment/com/smsapplication/sms/model/Sms;", "app_debug"})
    public final class SmsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable()
        @butterknife.BindView(value = assignment.com.smsapplication.R.id.time_elapsed)
        public android.widget.TextView timeElapsed;
        @org.jetbrains.annotations.Nullable()
        @butterknife.BindView(value = assignment.com.smsapplication.R.id.sender_initial)
        public android.widget.TextView senderInitial;
        @org.jetbrains.annotations.Nullable()
        @butterknife.BindView(value = assignment.com.smsapplication.R.id.sender_detail)
        public android.widget.TextView senderDetail;
        @org.jetbrains.annotations.Nullable()
        @butterknife.BindView(value = assignment.com.smsapplication.R.id.message)
        public android.widget.TextView message;
        @org.jetbrains.annotations.Nullable()
        @butterknife.BindView(value = assignment.com.smsapplication.R.id.unread_tag)
        public android.view.View unreadTag;
        @org.jetbrains.annotations.Nullable()
        @butterknife.BindView(value = assignment.com.smsapplication.R.id.sender_tag)
        public androidx.cardview.widget.CardView senderTag;
        
        public final void setViewData(@org.jetbrains.annotations.NotNull()
        assignment.com.smsapplication.sms.model.Sms sms) {
        }
        
        public SmsViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}