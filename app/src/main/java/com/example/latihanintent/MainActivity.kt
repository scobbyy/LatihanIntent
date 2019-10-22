package com.example.latihanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nim = findViewById<EditText>(R.id.text_nim)
        val nama = findViewById<EditText>(R.id.txt_nama)
        val nilai = findViewById<EditText>(R.id.tvt_nilai)
        val inputbtn = findViewById<Button>(R.id.btn_proses)

        inputbtn.setOnClickListener {
            val Nim = nim.text.toString()
            val Nama = nama.text.toString()
            val Nilai = nilai.text.toString()

            val intent = Intent(this@MainActivity, ActivityKedua::class.java)
            intent.putExtra("NIM", Nim)
            intent.putExtra("NAMA", Nama)
            intent.putExtra("NILAI", Nilai)
            startActivity(intent)

        }
    }
}
