package assignment.com.smsapplication.sms.view;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import assignment.com.smsapplication.R;
import assignment.com.smsapplication.sms.model.Sms;
import butterknife.BindView;
import butterknife.ButterKnife;

class SmsAdapter extends RecyclerView.Adapter<SmsAdapter.SmsViewHolder> {

    private Context context;
    private List<Sms> smsList;
    private long currentTime;
    private boolean timeFlag = true;
    private int count = 1;

    public SmsAdapter(Context context, List<Sms> smsList) {
        this.context = context;
        this.smsList = smsList;
        currentTime = System.currentTimeMillis();
    }

    @NonNull
    @Override
    public SmsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new SmsAdapter.SmsViewHolder(LayoutInflater.from(context).inflate(R.layout.sms_item,
                viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SmsViewHolder smsViewHolder, int i) {
        smsViewHolder.setViewData(smsList.get(i));
    }

    @Override
    public int getItemCount() {
        return smsList.size();
    }

    public class SmsViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.time_elapsed)
        TextView timeElapsed;
        @BindView(R.id.sender_initial)
        TextView senderInitial;
        @BindView(R.id.sender_detail)
        TextView senderDetail;
        @BindView(R.id.message)
        TextView message;
        @BindView(R.id.unread_tag)
        View unreadTag;
        @BindView(R.id.sender_tag)
        CardView senderTag;

        public SmsViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setViewData(Sms sms) {
            char c = sms.getSender().charAt(0);
            if (c == '+') {
                c = 'X';
            }
            unreadTag.setVisibility(View.GONE);
            senderDetail.setTypeface(null, Typeface.NORMAL);
            message.setTypeface(null, Typeface.NORMAL);
            if (!sms.getRead().equals("1")) {
                unreadTag.setVisibility(View.VISIBLE);
                senderDetail.setTypeface(null, Typeface.BOLD);
                message.setTypeface(null, Typeface.BOLD);
            }
            senderInitial.setText(c + "");
            senderDetail.setText(sms.getSender());
            message.setText(sms.getMessage());
            if (sms.getHoursAgo().length() > 0) {
                timeElapsed.setVisibility(View.VISIBLE);
                timeElapsed.setText(sms.getHoursAgo());
            } else {
                timeElapsed.setVisibility(View.GONE);
            }
        }

    }
}
