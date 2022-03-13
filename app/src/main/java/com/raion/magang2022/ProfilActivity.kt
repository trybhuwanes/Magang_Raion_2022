package com.raion.magang2022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfilActivity : AppCompatActivity() {
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

        //Menampilkan data
        tampilNama.text = namaLengkap
        tampilUsia.text = "Usia\n$usia"
        tampilTinggi.text = "Tinggi\nBadan\n$tinggiBadan"
    }
}