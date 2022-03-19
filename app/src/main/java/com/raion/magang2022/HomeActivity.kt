package com.raion.magang2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigationView = findViewById(R.id.bottom_navigation)

        //Fungsi untuk berpindah activity saat bottom navigation diklik
        val callback =
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when(item.itemId) {
                    R.id.page_home -> {
                        startActivity(Intent(this, HomeActivity::class.java))
                        true
                    }
                    R.id.page_timeline -> {
                        startActivity(Intent(this, TimelineActivity::class.java))
                        true
                    }
                    R.id.page_profil -> {
                        startActivity(Intent(this, ProfilActivity::class.java))
                        true
                    }
                    else -> false
                }
            }

        bottomNavigationView.setOnNavigationItemSelectedListener(callback)
    }
}