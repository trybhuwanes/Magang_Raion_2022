package com.raion.magang2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OnBoarding2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding2)
    }

    fun pindahMasuk(view: android.view.View) {
        startActivity(Intent(this, MasukActivity::class.java))
    }
}