// Generated code from Butter Knife. Do not modify!
package assignment.com.smsapplication.sms.view;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import assignment.com.smsapplication.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SmsAdapter$SmsViewHolder_ViewBinding implements Unbinder {
  private SmsAdapter.SmsViewHolder target;

  @UiThread
  public SmsAdapter$SmsViewHolder_ViewBinding(SmsAdapter.SmsViewHolder target, View source) {
    this.target = target;

    target.timeElapsed = Utils.findRequiredViewAsType(source, R.id.time_elapsed, "field 'timeElapsed'", TextView.class);
    target.senderInitial = Utils.findRequiredViewAsType(source, R.id.sender_initial, "field 'senderInitial'", TextView.class);
    target.senderDetail = Utils.findRequiredViewAsType(source, R.id.sender_detail, "field 'senderDetail'", TextView.class);
    target.message = Utils.findRequiredViewAsType(source, R.id.message, "field 'message'", TextView.class);
    target.unreadTag = Utils.findRequiredView(source, R.id.unread_tag, "field 'unreadTag'");
    target.senderTag = Utils.findRequiredViewAsType(source, R.id.sender_tag, "field 'senderTag'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SmsAdapter.SmsViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.timeElapsed = null;
    target.senderInitial = null;
    target.senderDetail = null;
    target.message = null;
    target.unreadTag = null;
    target.senderTag = null;
  }
}
