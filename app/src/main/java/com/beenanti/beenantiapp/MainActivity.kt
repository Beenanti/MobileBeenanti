package com.beenanti.beenantiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnmulai : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launchscreen)
        btnmulai = findViewById(R.id.btn_mulai)
        btnmulai.setOnClickListener{
            val intent = Intent(this@MainActivity, ProfilblmloginActivity::class.java)
            startActivity(intent)
        }
    }
}