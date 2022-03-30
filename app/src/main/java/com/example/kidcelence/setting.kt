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
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
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
        hideSystemBars()
        //Get the username from previous activity
        val userName = intent?.extras?.getString(Constant.username).toString()

        //button to reset user
        binding.btnReset.setOnClickListener {

            Constant.setUserName(this,"")//reset username
            Constant.setProfileImage(this,"")//reset profile picture
            val intent = Intent(this, MainActivity::class.java)//navigate to main page
            //pass through username to question activity\
            val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
            val editor = sharedPref.edit()
            editor.apply{
                //reset scores
                putString(Constant.finalscore, "0")
                putString(Constant.catOnescore, "0")
                putString(Constant.catTwoscore, "0")
                putString(Constant.catThreescore, "0")
                putString(Constant.catFourscore, "0")

                apply() //commit() - saves the prefrences
            }


            startActivity(intent)
            finish()
        }

    //button to reset scores
binding.btnSubmit.setOnClickListener{



    val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
    val editor = sharedPref.edit()

    //opens the file and edit it
    editor.apply{
        //reset scores
        putString(Constant.finalscore, "0")
        putString(Constant.catOnescore, "0")
        putString(Constant.catTwoscore, "0")
        putString(Constant.catThreescore, "0")
        putString(Constant.catFourscore, "0")

        apply() //commit() - saves the prefrences
    }

    val intent = Intent(this, categories::class.java)
    //pass through username to question activity
    intent.putExtra(Constant.username, userName)

    startActivity(intent)
    finish()

}






    }
//Full screen
    private fun hideSystemBars() {
        val windowInsetsController =
            ViewCompat.getWindowInsetsController(window.decorView) ?: return
        // Configure the behavior of the hidden system bars
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        // Hide both the status bar and the navigation bar
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
    }

}


