package assignment.com.smsapplication.sms.view

import android.content.Context
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import assignment.com.smsapplication.R
import assignment.com.smsapplication.sms.model.Sms
import assignment.com.smsapplication.sms.view.SmsAdapter.SmsViewHolder
import butterknife.BindView
import butterknife.ButterKnife

internal class SmsAdapter(private val context: Context, private val smsList: List<Sms>) : RecyclerView.Adapter<SmsViewHolder>() {
    private val currentTime: Long
    private val timeFlag = true
    private val count = 1
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): SmsViewHolder {
        return SmsViewHolder(LayoutInflater.from(context).inflate(R.layout.sms_item,
                viewGroup, false))
    }

    override fun onBindViewHolder(smsViewHolder: SmsViewHolder, i: Int) {
        smsViewHolder.setViewData(smsList[i])
    }

    override fun getItemCount(): Int {
        return smsList.size
    }

    inner class SmsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        @JvmField
        @BindView(R.id.time_elapsed)
        var timeElapsed: TextView? = null

        @JvmField
        @BindView(R.id.sender_initial)
        var senderInitial: TextView? = null

        @JvmField
        @BindView(R.id.sender_detail)
        var senderDetail: TextView? = null

        @JvmField
        @BindView(R.id.message)
        var message: TextView? = null

        @JvmField
        @BindView(R.id.unread_tag)
        var unreadTag: View? = null

        @JvmField
        @BindView(R.id.sender_tag)
        var senderTag: CardView? = null
        fun setViewData(sms: Sms) {
            var c = sms.sender!![0]
            if (c == '+') {
                c = 'X'
            }
            unreadTag!!.visibility = View.GONE
            senderDetail!!.setTypeface(null, Typeface.NORMAL)
            message!!.setTypeface(null, Typeface.NORMAL)
            if (sms.read != "1") {
                unreadTag!!.visibility = View.VISIBLE
                senderDetail!!.setTypeface(null, Typeface.BOLD)
                message!!.setTypeface(null, Typeface.BOLD)
            }
            senderInitial!!.text = c.toString() + ""
            senderDetail!!.text = sms.sender
            message!!.text = sms.message
            if (sms.hoursAgo.length > 0) {
                timeElapsed!!.visibility = View.VISIBLE
                timeElapsed!!.text = sms.hoursAgo
            } else {
                timeElapsed!!.visibility = View.GONE
            }
        }

        init {
            ButterKnife.bind(this, itemView)
        }
    }

    init {
        currentTime = System.currentTimeMillis()
    }
}