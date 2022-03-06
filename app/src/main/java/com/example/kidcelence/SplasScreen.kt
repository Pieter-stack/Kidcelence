package com.example.kidcelence

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplasScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splas_screen)

        Handler().postDelayed({
            val intent = Intent(this@SplasScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000,)

    }
}