package com.example.kidcelence

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.kidcelence.databinding.ActivityCategoriesBinding
import com.example.kidcelence.models.Constant
import java.io.File


class categories : AppCompatActivity() {

    //binding varible which will be the generated activity of our xml
    private lateinit var binding: ActivityCategoriesBinding
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //bind our activity to the root of this xml file
        //bind our activity to the root of this xml file
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        //Get the username from previous activity
            //intent?.extras?.getString(Constant.username).toString()
        val userName = Constant.getUserName(this)
        //add username on activity
        binding.tvName.setText("Hi there excelent "+ userName)

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        var Highscore = sharedPref.getString(Constant.finalscore, "0")


        binding.tvHighscore.setText("Highscore: " + Highscore)

        imageView = findViewById(R.id.iv_pfp)




binding.test.setOnClickListener {



    Constant.setUserName(this,"")
    Constant.setProfileImage(this,"")
    val intent = Intent(this, MainActivity::class.java)
    //pass through username to question activity\
    startActivity(intent)
    finish()
}




//https://stackoverflow.com/questions/15662258/how-to-save-a-bitmap-on-internal-storage
//https://www.tutorialspoint.com/how-to-write-an-image-file-in-internal-storage-in-android
        //TODO: help me pls
     // file dir   content://media/external/images/media/31
        //https://stackoverflow.com/questions/37540779/android-gallery-picker-and-camera-intent-crashes-upon-onactivityresult



//maybe add 4 variables wat jy 1 kan sit op sekere categories om the wys daai category is selected









        binding.cvSettings.setOnClickListener{
            val intent = Intent(this, setting::class.java)
            intent.putExtra(Constant.username, userName)
            startActivity(intent)
        }




        //animal sound button pressed
        binding.btnSound.setOnClickListener {
        //TODO: validation
            var question = "1";
            //navigate to question activity
            val intent = Intent(this, Questions::class.java)
            //pass through username to question activity
            intent.putExtra(Constant.username, userName)
            intent.putExtra(Constant.selectquestion, question)
            startActivity(intent)
            finish()


        }

        //Pattern button pressed
        binding.btnPattern.setOnClickListener {
        //TODO: validation
            var question = "2";
           //navigate to question activity
           val intent = Intent(this, Questions::class.java)
           //pass through username to question activity
           intent.putExtra(Constant.username, userName)
            intent.putExtra(Constant.selectquestion, question)
           startActivity(intent)
           finish()
        }

        //Math button pressed
        binding.btnMath.setOnClickListener {
        //TODO: validation
            var question = "3";
           //navigate to question activity
           val intent = Intent(this, Questions::class.java)
           //pass through username to question activity
           intent.putExtra(Constant.username, userName)
            intent.putExtra(Constant.selectquestion, question)
           startActivity(intent)
           finish()
        }

        //Story button pressed
        binding.btnStory.setOnClickListener {
        //TODO: validation
            var question = "4";
           //navigate to question activity
           val intent = Intent(this, Questions::class.java)
           //pass through username to question activity
           intent.putExtra(Constant.username, userName)
            intent.putExtra(Constant.selectquestion, question)
           startActivity(intent)
           finish()
        }

    }

    override fun onStart() {

        imageView.setImageURI(Uri.parse(Constant.getProfileImage(this )))
        super.onStart()
    }


}