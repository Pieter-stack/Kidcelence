package com.example.kidcelence

import android.R
import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.kidcelence.databinding.ActivityQuestionsBinding
import com.example.kidcelence.models.Constant
import java.util.*


class Questions : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)
        hideSystemBars()
        //Get the username from previous activity
        val userName = intent?.extras?.getString(Constant.username).toString()
        //Get the number of category selected
        val questionNumber = intent?.extras?.getString(Constant.selectquestion).toString()

        var currentQuestion = intent?.extras?.getInt(Constant.currentQuestion, 1)
        var currentScore = intent?.extras?.getInt(Constant.currentScore, 0)
        Log.d("currentscore", currentScore.toString())






        //See what question you are on
        if (questionNumber == "1") {

            //Style question
            binding.background.setBackgroundColor(Color.rgb(100, 108, 222))
            var questions = Constant.CategoryOneQuestions()
            var question = questions[currentQuestion!! - 1]

            //Progress bar update
            binding.pbProgress.progress = question.id


            //set questions up to display
            title = "Question " + question.id
            binding.tvQuestiontext.setText(question.question)
            binding.btnOption1.setText(question.optionOne)
            binding.btnOption2.setText(question.optionTwo)
            binding.btnOption3.setText(question.optionThree)
            binding.btnOption4.setText(question.optionFour)

            binding.btnPlay.setVisibility(View.VISIBLE)

            //Use Meadiaplayer to play animal sound
            val ring: MediaPlayer = MediaPlayer.create(this, question.icon)

            binding.btnPlay.setOnClickListener {

                //initiate mediaplayer to play animal sound

                //play sound
                ring.start()

                //ring timer to stop after 10 seconds
                val t = Timer()
                t.schedule(object : TimerTask() {
                    override fun run() {
                        ring.pause()
                        t.cancel()
                    }
                }, 10000)


            }
            //Play sound once before you can press button to rehear it
            ring.start()

            //See what button is pressed and if that button contains correct answer
            binding.btnOption1.setOnClickListener {
                if (question.optionOne == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else { //navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption2.setOnClickListener {
                if (question.optionTwo == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption3.setOnClickListener {
                if (question.optionThree == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption4.setOnClickListener {
                if (question.optionFour == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }

            }


        } else if (questionNumber == "2") {
            binding.background.setBackgroundColor(Color.rgb(225, 230, 255))
            var questions = Constant.CategoryTwoQuestions()
            var question = questions[currentQuestion!! - 1]

            binding.pbProgress.progress = question.id

            title = "Question " + question.id
            binding.tvQuestiontext.setText(question.question)
            binding.ivQuestion.setImageResource(question.icon)
            binding.btnOption1.setBackgroundResource(question.optionOne)
            binding.btnOption2.setBackgroundResource(question.optionTwo)
            binding.btnOption3.setBackgroundResource(question.optionThree)
            binding.btnOption4.setBackgroundResource(question.optionFour)
            binding.btnOption1.setText("")
            binding.btnOption2.setText("")
            binding.btnOption3.setText("")
            binding.btnOption4.setText("")
            binding.btnPlay.setVisibility(View.GONE)

            //See what button is pressed and if that button contains correct answer
            binding.btnOption1.setOnClickListener {
                if (question.optionOne == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption2.setOnClickListener {
                if (question.optionTwo == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption3.setOnClickListener {
                if (question.optionThree == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption4.setOnClickListener {
                if (question.optionFour == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }

            }

        } else if (questionNumber == "3") {
            binding.background.setBackgroundColor(Color.rgb(255, 223, 136))
            var questions = Constant.CategoryThreeQuestions()
            var question = questions[currentQuestion!! - 1]
            binding.pbProgress.progress = question.id
            title = "Question " + question.id
            binding.tvQuestiontext.setText(question.question)
            binding.ivQuestion.setImageResource(question.icon)
            binding.btnOption1.setText(question.optionOne)
            binding.btnOption2.setText(question.optionTwo)
            binding.btnOption3.setText(question.optionThree)
            binding.btnOption4.setText(question.optionFour)

            binding.btnPlay.setVisibility(View.GONE)




            //See what button is pressed and if that button contains correct answer
            binding.btnOption1.setOnClickListener {
                if (question.optionOne == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption2.setOnClickListener {
                if (question.optionTwo == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption3.setOnClickListener {
                if (question.optionThree == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption4.setOnClickListener {
                if (question.optionFour == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }

            }

        } else if (questionNumber == "4") {

            binding.background.setBackgroundColor(Color.rgb(255, 210, 220))
            var questions = Constant.CategoryFourQuestions()
            var question = questions[currentQuestion!! - 1]
            binding.pbProgress.progress = question.id
            title = "Question " + question.id
            binding.tvQuestiontext.setText(question.question)
            binding.ivQuestion.setImageResource(question.icon)
            binding.btnOption1.setText(question.optionOne)
            binding.btnOption2.setText(question.optionTwo)
            binding.btnOption3.setText(question.optionThree)
            binding.btnOption4.setText(question.optionFour)

            binding.btnPlay.setVisibility(View.GONE)




            //See what button is pressed and if that button contains correct answer
            binding.btnOption1.setOnClickListener {
                if (question.optionOne == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption2.setOnClickListener {
                if (question.optionTwo == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption3.setOnClickListener {
                if (question.optionThree == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }
            }
            //See what button is pressed and if that button contains correct answer
            binding.btnOption4.setOnClickListener {
                if (question.optionFour == question.answer) {
                    currentScore = currentScore!! + 1
                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                } else {

                    var nextQuestion = currentQuestion!! + 1
                    //if end of questions navigate to points page
                    if (nextQuestion > questions.count()) {
                        val intent = Intent(this, points::class.java)
                        //add username and current score to results
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    } else {//navigate to questions page with new question
                        val intent = Intent(this, Questions::class.java)
                        intent.putExtra(Constant.username, userName)
                        intent.putExtra(Constant.currentQuestion, nextQuestion)
                        // pass the score of the user to next question
                        intent.putExtra(Constant.currentScore, currentScore)
                        intent.putExtra(Constant.selectquestion, questionNumber)
                        startActivity(intent)
                        finish()
                    }

                }

            }

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
