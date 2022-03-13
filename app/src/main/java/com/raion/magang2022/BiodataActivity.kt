package com.raion.magang2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class BiodataActivity : AppCompatActivity() {
    private lateinit var inputNama : TextInputEditText
    private lateinit var inputUsia : TextInputEditText
    private lateinit var inputTinggi : TextInputEditText
    private lateinit var btnSelesai : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        inputNama = findViewById(R.id.nama_lengkap)
        inputUsia = findViewById(R.id.usia)
        inputTinggi = findViewById(R.id.tinggi_badan)
        btnSelesai = findViewById(R.id.btn_selesai)


        btnSelesai.setOnClickListener {
            val namaLengkap = inputNama.text.toString().trim()
            val usia = inputUsia.text.toString().trim()
            val tinggiBadan = inputTinggi.text.toString().trim()


            if (namaLengkap.isEmpty()) {
                inputNama.error = "Masukkan nama lengkap Anda"
                return@setOnClickListener
            } else if (usia.isEmpty()) {
                inputUsia.error = "Masukkan usia Anda"
                return@setOnClickListener
            } else if (tinggiBadan.isEmpty()) {
                inputTinggi.error = "Masukkan tinggi badan Anda"
            } else {
                val intent = Intent(this, ProfilActivity::class.java)
                intent.putExtra("Nama", namaLengkap)
                intent.putExtra("Usia", usia)
                intent.putExtra("Tinggi", tinggiBadan)
                Toast.makeText(this, "Biodata disimpan", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
        }
    }
}