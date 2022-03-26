package com.example.kidcelence

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.kidcelence.models.Constant

class SplasScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splas_screen)

        Handler().postDelayed({
            if( Constant.getUserName(this).equals("")){
                val intent = Intent(this@SplasScreen, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            else{
                val intent = Intent(this@SplasScreen, categories::class.java)
                startActivity(intent)
                finish()
            }

        },3000,)

    }
}