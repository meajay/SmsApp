// Generated code from Butter Knife. Do not modify!
package assignment.com.smsapplication.sms.view;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import assignment.com.smsapplication.R;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SmsActivity_ViewBinding implements Unbinder {
  private SmsActivity target;

  @UiThread
  public SmsActivity_ViewBinding(SmsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SmsActivity_ViewBinding(SmsActivity target, View source) {
    this.target = target;

    target.smsRecycler = Utils.findRequiredViewAsType(source, R.id.sms_recycler, "field 'smsRecycler'", ShimmerRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SmsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.smsRecycler = null;
  }
}
