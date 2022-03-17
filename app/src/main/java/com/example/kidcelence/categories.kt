package com.example.kidcelence

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.example.kidcelence.databinding.ActivityCategoriesBinding
import com.example.kidcelence.databinding.ActivityMainBinding
import com.example.kidcelence.models.Constant
import com.example.kidcelence.models.Question


class categories : AppCompatActivity() {

    //binding varible which will be the generated activity of our xml
    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //bind our activity to the root of this xml file
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        //Get the username from previous activity
        val userName = intent?.extras?.getString(Constant.username).toString()
        val profilePic = intent?.extras?.getString(Constant.profilepic).toString()
        //add username on activity
        binding.tvName.setText("Hi there excelent "+ userName)



        //TODO: help me pls
      binding.ivPfp.setImageResource(0)
     // file dir   content://media/external/images/media/31
        //https://stackoverflow.com/questions/37540779/android-gallery-picker-and-camera-intent-crashes-upon-onactivityresult



//maybe add 4 variables wat jy 1 kan sit op sekere categories om the wys daai category is selected



        binding.cvSettings.setOnClickListener{
            val intent = Intent(this, setting::class.java)
            startActivity(intent)
            finish()
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


}