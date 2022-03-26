package com.example.kidcelence

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.net.toUri
import com.example.kidcelence.databinding.ActivityPointsBinding
import com.example.kidcelence.databinding.ActivityQuestionsBinding
import com.example.kidcelence.models.Constant
import com.google.android.material.imageview.ShapeableImageView

class points : AppCompatActivity() {

    private lateinit var binding: ActivityPointsBinding

    lateinit var imageView: ShapeableImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPointsBinding.inflate(layoutInflater)
        val view = binding.root



        setContentView(view)

        imageView = findViewById(R.id.shape_Profile)
        var username = intent?.extras?.getString(Constant.username).toString()

        var finalScore = intent.getIntExtra(Constant.currentScore, 0)
        var questionCounts = Constant.CategoryOneQuestions().count()

        var currentscore = finalScore * 100

        if (finalScore > questionCounts / 2) {
            binding.tvWell.setText("Well Done " + ", " + username + "!")
            binding.tvScore.setText(finalScore.toString() + "/" + questionCounts.toString())
            binding.tvPoints.setText("You just scored " + " " + currentscore.toString() + " " + " points!")


        } else {
            binding.tvWell.setText("Awww better luck next time " + " , " + username + "!")
            binding.tvScore.setText(finalScore.toString() + "/" + questionCounts.toString())
            binding.tvPoints.setText("You just scored " + " " + currentscore.toString() + " " + " points!")
        }







        //set up local storage
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()


        var finalscore = sharedPref.getString(Constant.finalscore, "0")


//resolveUri failed on bad bitmap uri: ://media/external/images/media/31
        //https://stackoverflow.com/questions/3681714/bad-bitmap-error-when-setting-uri
        var Highcore: Int? = finalscore?.toInt()?.plus(currentscore)

        Log.d("Highscore", Highcore.toString())

        //opens the file and edit it
        editor.apply {
            putString(Constant.finalscore, Highcore.toString())

            apply() //commit() - saves the prefrences
        }


        binding.btnHome.setOnClickListener {
            val intent = Intent(this, categories::class.java)
            intent.putExtra(Constant.username, username)
            //TODO: save to device storage
            startActivity(intent)
            finish()
        }


    }

    override fun onStart() {

        imageView.setImageURI(Uri.parse(Constant.getProfileImage(this )))
        super.onStart()
    }

    }
