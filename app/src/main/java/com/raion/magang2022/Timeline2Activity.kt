package com.raion.magang2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Timeline2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeline2)

        val intent2 = intent
        val status = intent2.getStringExtra("Status")
        val namaLengkap = intent2.getStringExtra("Nama")

        //Mendefinisikan objek
        val tampilNama = findViewById<TextView>(R.id.tv_tampilStatus)
        val tampilStatus = findViewById<TextView>(R.id.tv_tampilStatus)

        tampilNama.text = "$namaLengkap : "
        tampilStatus.text = status

    }
}