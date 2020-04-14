package com.leia.leialoft.crashtest

import android.app.Application
import android.util.Log
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import java.util.Date


class CrashApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initAppCenter()
    }

    private fun initAppCenter() {
        AppCenter.setLogLevel(Log.VERBOSE)
        AppCenter.start(this, "aae72481-e30a-459f-b31b-0be161681afc",
            Analytics::class.java, Crashes::class.java
        )
        Analytics.trackEvent("App Started at :" + Date())
    }
}
