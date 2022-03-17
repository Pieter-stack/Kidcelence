package com.example.kidcelence

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kidcelence.databinding.ActivityPointsBinding
import com.example.kidcelence.databinding.ActivityQuestionsBinding
import com.example.kidcelence.models.Constant

class points : AppCompatActivity() {

    private lateinit var binding: ActivityPointsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPointsBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)


        var username = intent?.extras?.getString(Constant.username).toString()
        var finalScore = intent.getIntExtra(Constant.currentScore, 0)
        var questionCounts = Constant.CategoryOneQuestions().count()

        var currentscore = finalScore*100

        if (finalScore > questionCounts/2){
            binding.tvWell.setText("Well Done" + ","+ username + "!")
            binding.tvScore.setText(finalScore.toString() + "/" + questionCounts.toString())
            binding.tvPoints.setText( "You just scored" + currentscore.toString() + "points!")


        }else{
            binding.tvWell.setText("Awww better luck next time " + ", "+ username + "!")
            binding.tvScore.setText(finalScore.toString() + "/" + questionCounts.toString())
            binding.tvPoints.setText( "You just scored " + currentscore.toString() + " points!")
        }


        binding.btnHome.setOnClickListener {
            val intent = Intent(this, categories::class.java)
            intent.putExtra(Constant.username, username)
            //TODO: save to device storage
            startActivity(intent)
            finish()
        }







    }
}