package com.raion.magang2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OnBoarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)
    }

    fun pindahOnBoarding2(view: android.view.View) {
        startActivity(Intent(this, OnBoarding2Activity::class.java))
    }
}