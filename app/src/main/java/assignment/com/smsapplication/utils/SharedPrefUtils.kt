package assignment.com.smsapplication.utils

import android.content.Context

class SharedPrefUtils {
    companion object{
        fun getResetValue(context: Context):Boolean{
            return SharedPreferences.getSharedPref(context).getBoolean("RESET_FLAG",false)
        }

        fun setResetValue(context: Context,value:Boolean){
            val editor = SharedPreferences.getSharedPref(context).edit()
            editor.putBoolean("RESET_FLAG",value)
            editor.apply()
        }
    }
}