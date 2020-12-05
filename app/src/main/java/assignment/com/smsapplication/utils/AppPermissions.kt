package assignment.com.smsapplication.utils

import android.Manifest
import android.content.Context
import pub.devrel.easypermissions.EasyPermissions

class AppPermissions(private val context: Context) {
    fun hasSmsPermission(): Boolean {
        return EasyPermissions.hasPermissions(context, Manifest.permission.READ_SMS)
    }

}