package com.ruiter.kmovies

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.movieg.home.discover.presentation.view.DiscoverActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, DiscoverActivity::class.java))
        finish()
    }
}