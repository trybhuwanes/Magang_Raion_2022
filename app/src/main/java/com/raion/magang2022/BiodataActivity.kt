package com.raion.magang2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class BiodataActivity : AppCompatActivity() {
    //Mendeklarasikan
    private lateinit var inputNama : TextInputEditText
    private lateinit var inputUsia : TextInputEditText
    private lateinit var inputTinggi : TextInputEditText
    private lateinit var btnSelesai : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        //Mendefinisikan objek
        inputNama = findViewById(R.id.nama_lengkap)
        inputUsia = findViewById(R.id.usia)
        inputTinggi = findViewById(R.id.tinggi_badan)
        btnSelesai = findViewById(R.id.btn_selesai)

        //Fungsi ketika tombol selesai diklik
        btnSelesai.setOnClickListener {
            //Mengubahnya menjadi text agar bisa ditampilkan dan dibaca oleh user
            val namaLengkap = inputNama.text.toString().trim()
            val usia = inputUsia.text.toString().trim()
            val tinggiBadan = inputTinggi.text.toString().trim()

            //Pengecekan inputan
            if (namaLengkap.isEmpty()) {
                inputNama.error = "Masukkan nama lengkap Anda"
                return@setOnClickListener
            } else if (usia.isEmpty()) {
                inputUsia.error = "Masukkan usia Anda"
                return@setOnClickListener
            } else if (tinggiBadan.isEmpty()) {
                inputTinggi.error = "Masukkan tinggi badan Anda"
            } else {
                //Intent untuk passing data
                val intent = Intent(this, ProfilActivity::class.java)
                intent.putExtra("Nama", namaLengkap)
                intent.putExtra("Usia", usia)
                intent.putExtra("Tinggi", tinggiBadan)
                val intent2 = Intent(this, Timeline2Activity::class.java)
                intent2.putExtra("Nama", namaLengkap)
                Toast.makeText(this, "Biodata disimpan", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
        }
    }
}