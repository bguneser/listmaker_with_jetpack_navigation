package com.bguneser.listmaker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import kotlinx.android.synthetic.main.activity_main.*
//import sun.jvm.hotspot.utilities.IntArray


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        Navigation.findNavController(this,R.id.nav_host_fragment)

        AppCenter.start(
            application, "1b0bd7c5-2270-4ecf-9a32-1a793b8acff7",
            Analytics::class.java, Crashes::class.java
        )
    }

    override fun onBackPressed() {
        super.onBackPressed()
        toolbar.title=getString(R.string.Listmaker)
    }
}
