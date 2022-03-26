package com.example.kidcelence

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.provider.MediaStore
import android.provider.MediaStore.Audio.Albums.INTERNAL_CONTENT_URI
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.kidcelence.databinding.ActivitySettingBinding
import com.example.kidcelence.models.Constant
import java.io.File


class setting : AppCompatActivity() {

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        //Get the username from previous activity
        val userName = intent?.extras?.getString(Constant.username).toString()





binding.btnSubmit.setOnClickListener{



    val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
    val editor = sharedPref.edit()
    var finalscore = sharedPref.getString(Constant.finalscore, "0")

    //opens the file and edit it
    editor.apply{
        putString(Constant.finalscore, "0")

        apply() //commit() - saves the prefrences
    }

    val intent = Intent(this, categories::class.java)
    //pass through username to question activity
    intent.putExtra(Constant.username, userName)

    startActivity(intent)
    finish()

}






    }



}


