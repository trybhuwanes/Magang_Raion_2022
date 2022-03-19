package com.raion.magang2022

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.textfield.TextInputEditText

class TimelineActivity : AppCompatActivity() {
    //Mendeklarasikan
    private lateinit var inputStatus : TextInputEditText
    private lateinit var btnKirim : ImageButton
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timeline)

        //Mendefinisikan objek
        inputStatus = findViewById(R.id.inputStatus)
        btnKirim = findViewById(R.id.btn_kirim)
        bottomNavigationView = findViewById(R.id.bottom_navigation)

        //Fungsi ketika tombol selesai diklik
        btnKirim.setOnClickListener {
            val status = inputStatus.text.toString().trim()

            if (status.isEmpty()) {
                inputStatus.error = "Masih kosong nih"
            } else {
                val intent2 = Intent(this, Timeline2Activity::class.java)
                intent2.putExtra("Status", status)

                Toast.makeText(this, "Berhasil dipost!", Toast.LENGTH_SHORT).show()
                startActivity(intent2)
            }
        }

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