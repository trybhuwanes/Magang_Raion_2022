package com.raion.magang2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MasukActivity : AppCompatActivity() {

    //Deklarasi text input dan tombol
    private lateinit var inputEmail : TextInputEditText
    private lateinit var inputKatasandi : TextInputEditText
    private lateinit var btnMasuk : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        //Mendefinisikan objek
        inputEmail = findViewById(R.id.email)
        inputKatasandi = findViewById(R.id.katasandi)
        btnMasuk = findViewById(R.id.btn_masuk)

        //Fungsi ketika btnMasuk di klik
        btnMasuk.setOnClickListener {
            //Mengubahnya menjadi text agar dapat dilihat dan dibaca
            val email = inputEmail.text.toString().trim()
            val kataSandi = inputKatasandi.text.toString().trim()

            //Memvalidasi atau mengecek data yang telah diinput
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                //jika format email salah
                inputEmail.error = "Masukkan email dengan benar"
                return@setOnClickListener
            } else if (kataSandi.isEmpty()) {
                //jika kata sandi kosong
                inputKatasandi.error = "Masukkan kata sandi"
                return@setOnClickListener
            } else {
                //jika email dan kata sandi sudah benar
                Toast.makeText(this, "Berhasil masuk", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, BiodataActivity::class.java))
            }
        }
    }
}