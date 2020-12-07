package assignment.com.smsapplication.sms.view

import android.Manifest
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import assignment.com.smsapplication.R
import assignment.com.smsapplication.SmsApp
import assignment.com.smsapplication.constants.AppConstants
import assignment.com.smsapplication.sms.model.Sms
import assignment.com.smsapplication.sms.presenter.SmsPresenter
import assignment.com.smsapplication.utils.AppPermissions
import butterknife.BindView
import butterknife.ButterKnife
import com.cooltechworks.views.shimmer.ShimmerRecyclerView
import pub.devrel.easypermissions.AppSettingsDialog
import pub.devrel.easypermissions.EasyPermissions
import pub.devrel.easypermissions.EasyPermissions.PermissionCallbacks
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

class SmsActivity : AppCompatActivity(),SmsMvpView, PermissionCallbacks {
    @JvmField
    @BindView(R.id.sms_recycler)
    var smsRecycler: RecyclerView? = null
    @JvmField
    @BindView(R.id.progress_circular)
    var progressView : ProgressBar? = null

    @JvmField
    @Inject
    var smsPresenter: SmsPresenter? = null
    private var appPermissions: AppPermissions? = null
    private var smsAdapter: SmsAdapter? = null
    private val smsList = mutableListOf<Sms>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms)
        ButterKnife.bind(this)
        injectDependencies()
        smsPresenter?.onAttach(this)
        appPermissions = AppPermissions(this)
        setUpRecyclerView()
        checkAndRequestSMSPermission()
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        fetchInBoxMessages(true)
//        smsRecycler!!.showShimmerAdapter()
    }

//    override fun onResume() {
//        super.onResume()
//        smsList.clear()
//        checkAndRequestSMSPermission()
//    }

    override fun onPermissionsGranted(requestCode: Int, perms: List<String>) {
        if (requestCode == AppConstants.READ_SMS_PERMISIONS) {
            fetchInBoxMessages(true)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>,
                                            grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults,
                this)
    }

    override fun onPermissionsDenied(requestCode: Int, perms: List<String>) {
        if (requestCode == AppConstants.READ_SMS_PERMISIONS) {
            Toast.makeText(this, R.string.must_read_permissions,
                    Toast.LENGTH_LONG)
                    .show()
            requestSmsPermission()
            if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
                AppSettingsDialog.Builder(this).build().show()
            }
        }
    }

    override fun onGetInboxMessagesResponse(result: Int, smsList: List<Sms?>?, message: String?) {
        progressView?.visibility = View.GONE
        if (result == AppConstants.SUCCESS) {
            updateAdapter(smsList)
        } else {
            Toast.makeText(this, "Error : $message", Toast.LENGTH_SHORT).show()
        }
    }

    fun updateAdapter(smsList: List<Sms?>?) {
        if (smsList != null) {
            for(sms in smsList) {
                if (sms != null) {
                    this.smsList.add(sms)
                }
            }
        }
        smsAdapter?.notifyDataSetChanged()
    }

    private fun checkAndRequestSMSPermission() {
        if (appPermissions?.hasSmsPermission()!!) {
            fetchInBoxMessages(true)
        } else {
            requestSmsPermission()
        }
    }

    private fun fetchInBoxMessages(reset : Boolean) {
        smsPresenter!!.allInBoxMessages(reset)
        progressView?.visibility = View.VISIBLE
        if(reset){
            smsList.clear()
            smsRecycler?.smoothScrollToPosition(0)
        }

    }


    private fun injectDependencies() {
        (application as SmsApp).getAppComponent()!!.inject(this)
    }

    private fun requestSmsPermission() {
        EasyPermissions.requestPermissions(this, getString(R.string.sms_required),
                AppConstants.READ_SMS_PERMISIONS,
                Manifest.permission.READ_SMS,Manifest.permission.RECEIVE_SMS)
    }

    private fun setUpRecyclerView() {
        smsRecycler!!.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL
                , false)
        smsAdapter = SmsAdapter(this, smsList)
        smsRecycler!!.adapter = smsAdapter
//        smsRecycler!!.showShimmerAdapter()
        smsRecycler!!.addOnScrollListener(onScrollChanged)
    }

    private val onScrollChanged = object : RecyclerView.OnScrollListener(){
        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
            super.onScrollStateChanged(recyclerView, newState)
            if (!recyclerView.canScrollVertically(1) && newState==RecyclerView.SCROLL_STATE_IDLE) {
                fetchInBoxMessages(false)
            }
        }
    }

}