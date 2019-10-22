package com.example.latihanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_kedua.*

class ActivityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)
        var intent = intent
        val Nim = intent.getStringExtra("NIM")
        val Nama = intent.getStringExtra("NAMA")
        var Nilai = intent.getStringExtra("NILAI")

        val txt_hasil = findViewById<TextView>(R.id.txt_hasil)
        txt_hasil.text = "NIM         : "+Nim+"\nNAMA     : "+Nama+"\nNILAI       : "+Nilai

        val keterangan = findViewById<TextView>(R.id.txt_ket)
        val nilaiInt = Nilai.toInt()
        if (nilaiInt >= 80 || nilaiInt == 100) {
            txt_ket.text = "Keterangan : A"
        }
        else if (nilaiInt >= 60) {
            txt_ket.text = "Keterangan : B"
        }
        else if (nilaiInt >= 40) {
            txt_ket.text = "Keterangan : C"
        }
        else if (nilaiInt >= 20) {
            txt_ket.text = "Keterangan : D"
        }
        else if (Nilai >= 0.toInt().toString()) {
            txt_ket.text = "Keterangan : E"
        }
    }
}
