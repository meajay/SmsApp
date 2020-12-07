// Generated code from Butter Knife. Do not modify!
package assignment.com.smsapplication.sms.view;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import assignment.com.smsapplication.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public final class SmsAdapter$SmsViewHolder_ViewBinding implements Unbinder {
  private SmsAdapter.SmsViewHolder target;

  @UiThread
  public SmsAdapter$SmsViewHolder_ViewBinding(SmsAdapter.SmsViewHolder target, View source) {
    this.target = target;

    target.timeElapsed = Utils.findOptionalViewAsType(source, R.id.time_elapsed, "field 'timeElapsed'", TextView.class);
    target.senderInitial = Utils.findOptionalViewAsType(source, R.id.sender_initial, "field 'senderInitial'", TextView.class);
    target.senderDetail = Utils.findOptionalViewAsType(source, R.id.sender_detail, "field 'senderDetail'", TextView.class);
    target.message = Utils.findOptionalViewAsType(source, R.id.message, "field 'message'", TextView.class);
    target.unreadTag = source.findViewById(R.id.unread_tag);
    target.senderTag = Utils.findOptionalViewAsType(source, R.id.sender_tag, "field 'senderTag'", CardView.class);
  }

  @Override
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
