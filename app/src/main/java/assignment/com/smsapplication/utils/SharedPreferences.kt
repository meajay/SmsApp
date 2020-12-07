package assignment.com.smsapplication.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPreferences() {
    companion object{
      fun getSharedPref(context: Context): SharedPreferences {
          return context.getSharedPreferences("SMS_APP", 0)
      }
  }
}
