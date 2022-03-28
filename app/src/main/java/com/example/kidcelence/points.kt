package com.example.kidcelence

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
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
        hideSystemBars()
        imageView = findViewById(R.id.shape_Profile)
        var username = intent?.extras?.getString(Constant.username).toString()
        val questionNumber = intent?.extras?.getString(Constant.selectquestion).toString()
        var finalScore = intent.getIntExtra(Constant.currentScore, 0)
        var questionCounts = Constant.CategoryOneQuestions().count()


        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        var ScoreOne = sharedPref.getString(Constant.catOnescore, "0")
        var ScoreTwo = sharedPref.getString(Constant.catTwoscore, "0")
        var ScoreThree = sharedPref.getString(Constant.catThreescore, "0")
        var ScoreFour = sharedPref.getString(Constant.catFourscore, "0")

        println("bhnabnhwdbnawuiduiawndhj" + questionNumber)

        if (questionNumber == "1") {

            binding.btnLeftONE.setVisibility(View.VISIBLE)
            binding.btnRightONE.setVisibility(View.VISIBLE)
            binding.btnLeftTWO.setVisibility(View.GONE)
            binding.btnRightTWO.setVisibility(View.GONE)
            binding.btnLeftTHREE.setVisibility(View.GONE)
            binding.btnRightTHREE.setVisibility(View.GONE)
            binding.btnLeftFOUR.setVisibility(View.GONE)
            binding.btnRightFOUR.setVisibility(View.GONE)

if(ScoreOne == "null"){
    ScoreOne = finalScore.toString()
}


if(finalScore > ScoreOne!!.toInt()){
    editor.apply{
        putString(Constant.catOnescore, finalScore.toString())

        apply() //commit() - saves the prefrences
    }
    binding.tvHighscore.setVisibility(View.VISIBLE)
    binding.tvBest.setText("Personal best: " + finalScore +"/5")
}else{
    binding.tvBest.setText("Personal best: " + ScoreOne +"/5")
    binding.tvHighscore.setVisibility(View.GONE)
}

        }else if (questionNumber == "2") {
            binding.btnLeftONE.setVisibility(View.GONE)
            binding.btnRightONE.setVisibility(View.GONE)
            binding.btnLeftTWO.setVisibility(View.VISIBLE)
            binding.btnRightTWO.setVisibility(View.VISIBLE)
            binding.btnLeftTHREE.setVisibility(View.GONE)
            binding.btnRightTHREE.setVisibility(View.GONE)
            binding.btnLeftFOUR.setVisibility(View.GONE)
            binding.btnRightFOUR.setVisibility(View.GONE)


            if(ScoreTwo == "null"){
                ScoreTwo = finalScore.toString()
            }


            if(finalScore > ScoreTwo!!.toInt()){
                editor.apply{
                    putString(Constant.catTwoscore, finalScore.toString())

                    apply() //commit() - saves the prefrences
                }
                binding.tvHighscore.setVisibility(View.VISIBLE)
                binding.tvBest.setText("Personal best: " + finalScore +"/5")
            }else{
                binding.tvBest.setText("Personal best: " + ScoreTwo +"/5")
                binding.tvHighscore.setVisibility(View.GONE)
            }


        }else if (questionNumber == "3") {
            binding.btnLeftONE.setVisibility(View.GONE)
            binding.btnRightONE.setVisibility(View.GONE)
            binding.btnLeftTWO.setVisibility(View.GONE)
            binding.btnRightTWO.setVisibility(View.VISIBLE)
            binding.btnLeftTHREE.setVisibility(View.VISIBLE)
            binding.btnRightTHREE.setVisibility(View.VISIBLE)
            binding.btnLeftFOUR.setVisibility(View.GONE)
            binding.btnRightFOUR.setVisibility(View.GONE)


            if(ScoreThree == "null"){
                ScoreThree = finalScore.toString()
            }


            if(finalScore > ScoreThree!!.toInt()){
                editor.apply{
                    putString(Constant.catThreescore, finalScore.toString())

                    apply() //commit() - saves the prefrences
                }
                binding.tvHighscore.setVisibility(View.VISIBLE)
                binding.tvBest.setText("Personal best: " + finalScore +"/5")
            }else{
                binding.tvBest.setText("Personal best: " + ScoreThree +"/5")
                binding.tvHighscore.setVisibility(View.GONE)
            }



        }else if (questionNumber == "4") {
            binding.btnLeftONE.setVisibility(View.GONE)
            binding.btnRightONE.setVisibility(View.GONE)
            binding.btnLeftTWO.setVisibility(View.GONE)
            binding.btnRightTWO.setVisibility(View.GONE)
            binding.btnLeftTHREE.setVisibility(View.GONE)
            binding.btnRightTHREE.setVisibility(View.GONE)
            binding.btnLeftFOUR.setVisibility(View.VISIBLE)
            binding.btnRightFOUR.setVisibility(View.VISIBLE)


            if(ScoreFour == "null"){
                ScoreOne = finalScore.toString()
            }


            if(finalScore > ScoreFour!!.toInt()){
                editor.apply{
                    putString(Constant.catFourscore, finalScore.toString())

                    apply() //commit() - saves the prefrences
                }
                binding.tvHighscore.setVisibility(View.VISIBLE)
                binding.tvBest.setText("Personal best: " + finalScore +"/5")
            }else{
                binding.tvBest.setText("Personal best: " + ScoreFour +"/5")
                binding.tvHighscore.setVisibility(View.GONE)
            }


        }






        var currentscore = finalScore * 100

        if (finalScore > questionCounts / 2) {
            binding.tvWell.setText("Well Done" + ", " + username + "!")
            binding.tvScore.setText(finalScore.toString() + "/" + questionCounts.toString())
            binding.tvPoints.setText("You just scored " + " " + currentscore.toString() + " " + " points!")


        } else {
            binding.tvWell.setText("Awww better luck next time" + ", " + username + "!")
            binding.tvScore.setText(finalScore.toString() + "/" + questionCounts.toString())
            binding.tvPoints.setText("You just scored " + " " + currentscore.toString() + " " + " points!")
        }







        //set up local storage



        var finalscore = sharedPref.getString(Constant.finalscore, "0")

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
