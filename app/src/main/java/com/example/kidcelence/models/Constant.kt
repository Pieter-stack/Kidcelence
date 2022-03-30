package com.example.kidcelence.models

import android.content.Context
import android.util.Log
import com.example.kidcelence.R
import kotlin.random.Random


object Constant {


    public val username = "USERNAME"
    public val finalscore = "FINALSCORE"
    public val catOnescore = "CATONESCORE"
    public val catTwoscore = "CATTWOSCORE"
    public val catThreescore = "CATTHREESCORE"
    public val catFourscore ="CATFOURSCORE"
    public val selectquestion = "SELECTQUESTION"
    public val currentQuestion = "CURRENTQUESTION"
    public val currentScore = "CURRENTSCORE"
    public val userProfile = "USERPROFILE"






    fun CategoryOneQuestions(): ArrayList<Question>{

        //init question array
        var cat1Questions = ArrayList<Question>()

        //create q
val queOne = Question(
    1,
    "What animal makes this sound?",
    R.raw.sound1,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)

val queTwo = Question(
    2,
    "What animal makes this sound?",
    R.raw.sound2,
    "Dog",
    "Cat",
    "Guinea Pig",
    "Rabbit",
    "Cat"
)

val queThree = Question(
    3,
    "What animal makes this sound?",
    R.raw.sound3,
    "Elephant",
    "Lion",
    "Wolf",
    "Turkey",
    "Lion"
)

val queFour = Question(
    4,
    "What animal makes this sound?",
    R.raw.sound4,
    "Zebra",
    "Rhino",
    "Elephant",
    "Giraffe",
    "Elephant"
)

val queFive = Question(
    5,
    "What animal makes this sound?",
    R.raw.sound5,
    "Duck",
    "Sheep",
    "Mouse",
    "Donkey",
    "Donkey"
)

        cat1Questions.add(queOne)
        cat1Questions.add(queTwo)
        cat1Questions.add(queThree)
        cat1Questions.add(queFour)
        cat1Questions.add(queFive)


       // cat1Questions.shuffle()



        return cat1Questions
    }


    fun CategoryTwoQuestions(): ArrayList<QuestionPattern>{

        //init question array
        var cat2Questions = ArrayList<QuestionPattern>()

        //create q
        val queOne = QuestionPattern(
            1,
            "Complete the pattern?",
            R.drawable.pattern1,
            R.drawable.apattern14,
            R.drawable.apattern12,
            R.drawable.apattern11,
            R.drawable.apattern13,
            R.drawable.apattern11
        )

        val queTwo = QuestionPattern(
            2,
            "Complete the pattern??",
            R.drawable.pattern2,
            R.drawable.apattern13,
            R.drawable.apattern12,
            R.drawable.apattern14,
            R.drawable.apattern11,
            R.drawable.apattern14
        )

        val queThree = QuestionPattern(
            3,
            "Complete the pattern??",
            R.drawable.pattern3,
            R.drawable.apattern13,
            R.drawable.apattern12,
            R.drawable.apattern11,
            R.drawable.apattern14,
            R.drawable.apattern13
        )

        val queFour = QuestionPattern(
            4,
            "Complete the pattern??",
            R.drawable.pattern4,
            R.drawable.apattern11,
            R.drawable.apattern14,
            R.drawable.apattern13,
            R.drawable.apattern12,
            R.drawable.apattern12
        )

        val queFive = QuestionPattern(
            5,
            "Complete the pattern??",
            R.drawable.pattern5,
            R.drawable.apattern11,
            R.drawable.apattern13,
            R.drawable.apattern12,
            R.drawable.apattern14,
            R.drawable.apattern13
        )


        cat2Questions.add(queOne)
        cat2Questions.add(queTwo)
        cat2Questions.add(queThree)
        cat2Questions.add(queFour)
        cat2Questions.add(queFive)



        return cat2Questions
    }



    fun CategoryThreeQuestions(): ArrayList<Question>{

        //init question array
        var cat3Questions = ArrayList<Question>()

        //create q
        val queOne = Question(
            1,
            "How many legs do you see?",
            R.drawable.math1,
            "8",
            "10",
            "16",
            "24",
            "16"
        )

        val queTwo = Question(
            2,
            "What is the answer?",
            R.drawable.math2,
            "33",
            "35",
            "36",
            "38",
            "35"
        )

        val queThree = Question(
            3,
            "What is the answer?",
            R.drawable.math3,
            "25",
            "30",
            "35",
            "38",
            "30"
        )

        val queFour = Question(
            4,
            "What is the answer?",
            R.drawable.math4,
            "4",
            "6",
            "7",
            "8",
            "6"
        )

        val queFive = Question(
            5,
            "What is the answer?",
            R.drawable.math5,
            "4",
            "3",
            "6",
            "5",
            "3"
        )


        cat3Questions.add(queOne)
        cat3Questions.add(queTwo)
        cat3Questions.add(queThree)
        cat3Questions.add(queFour)
        cat3Questions.add(queFive)



        return cat3Questions
    }


    fun CategoryFourQuestions(): ArrayList<Question>{

        //init question array
        var cat4Questions = ArrayList<Question>()

        //create q
        val queOne = Question(
            1,
            "George saved all his money in his_____",
            R.drawable.storyq1,
            "Wallet",
            "Piggy bank",
            "Bank",
            "Locker",
            "Piggy bank"
        )

        val queTwo = Question(
            2,
            "He then decided to buy himself a _____",
            R.drawable.storyq2,
            "Dog",
            "Cat",
            "Goldfish",
            "Guinea Pig",
            "Dog"
        )

        val queThree = Question(
            3,
            "He wanted to teach his dog some ____",
            R.drawable.storyq3,
            "Manners",
            "Tricks",
            "Words",
            "Command",
            "Tricks"
        )

        val queFour = Question(
            4,
            "George then rewarded Pablo with a ____",
            R.drawable.storyq4,
            "Carrot",
            "Sweets",
            "Biscuit",
            "Bone",
            "Bone"
        )

        val queFive = Question(
            5,
            "George built Pablo a ____",
            R.drawable.storyq5,
            "Tent",
            "Dog Cage",
            "Dog House",
            "Kennel",
            "Dog House"
        )


        cat4Questions.add(queOne)
        cat4Questions.add(queTwo)
        cat4Questions.add(queThree)
        cat4Questions.add(queFour)
        cat4Questions.add(queFive)



        return cat4Questions
    }
//Get and set profile picture
    fun getProfileImage( context: Context): String{
        val sharedPref = context.getSharedPreferences("myPref", Context.MODE_PRIVATE)
        return sharedPref.getString(userProfile, "").toString()
    }

    fun setProfileImage( context: Context , profile :String){
        val sharedPref = context.getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        //opens the file and edit it
        editor.apply{
            putString(userProfile, profile)

            apply() //commit() - saves the prefrences
        }
    }
//Get and set username
    fun getUserName( context: Context): String{
        val sharedPref = context.getSharedPreferences("myPref", Context.MODE_PRIVATE)
        return sharedPref.getString(username, "").toString()
    }

    fun setUserName( context: Context , profile :String){
        val sharedPref = context.getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        //opens the file and edit it
        editor.apply{
            putString(username, profile)

            apply() //commit() - saves the prefrences
        }
    }





}