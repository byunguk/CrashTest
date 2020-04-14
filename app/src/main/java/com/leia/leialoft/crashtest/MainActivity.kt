package com.leia.leialoft.crashtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupUi()
    }

    private fun setupUi() {
        findViewById<Button>(R.id.button).setOnClickListener {
            Crashes.generateTestCrash()
        }
    }
}
