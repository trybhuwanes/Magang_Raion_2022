package com.raion.magang2022

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfilActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        //Mengambil data
        val intent = intent
        val namaLengkap = intent.getStringExtra("Nama")
        val usia = intent.getStringExtra("Usia")
        val tinggiBadan = intent.getStringExtra("Tinggi")

        //Mendefinisikan objek sebagai tempat menampilkan teks biodata
        val tampilNama = findViewById<TextView>(R.id.tv_nama)
        val tampilUsia = findViewById<TextView>(R.id.tv_usia)
        val tampilTinggi = findViewById<TextView>(R.id.tv_tinggiBadan)
        bottomNavigationView = findViewById(R.id.bottom_navigation)

        //Menampilkan data
        tampilNama.text = namaLengkap
        tampilUsia.text = "Usia\n$usia"
        tampilTinggi.text = "Tinggi\nBadan\n$tinggiBadan"

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