package com.example.kidcelence.models

import com.example.kidcelence.R

object Constant {


    public val username = "USERNAME"
    public val profilepic = "PROFILEPIC"
    public val selectquestion = "SELECTQUESTION"
    public val currentQuestion = "CURRENTQUESTION"
    public val currentScore = "CURRENTSCORE"

    fun CategoryOneQuestions(): ArrayList<Question>{

        //init question array
        var cat1Questions = ArrayList<Question>()

        //create q
val queOne = Question(
    1,
    "What animal is this sound from   1?",
    R.raw.sound,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)

val queTwo = Question(
    1,
    "What animal is this sound from   2?",
    R.drawable.animalimg,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)

val queThree = Question(
    1,
    "What animal is this sound from   3 ?",
    R.drawable.animalimg,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)

val queFour = Question(
    1,
    "What animal is this sound from   4?",
    R.drawable.animalimg,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)

val queFive = Question(
    1,
    "What animal is this sound from   5?",
    R.drawable.animalimg,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)


        cat1Questions.add(queOne)
        cat1Questions.add(queTwo)
        cat1Questions.add(queThree)
        cat1Questions.add(queFour)
        cat1Questions.add(queFive)



        return cat1Questions
    }


    fun CategoryTwoQuestions(): ArrayList<Question>{

        //init question array
        var cat2Questions = ArrayList<Question>()

        //create q
        val queOne = Question(
            1,
            "Pattern1?",
            R.drawable.patternimg,
            "square",
            "circle",
            "triangle",
            "hexagon",
            "square"
        )

        val queTwo = Question(
            1,
            "Pattern2?",
            R.drawable.patternimg,
            "square",
            "circle",
            "triangle",
            "hexagon",
            "square"
        )

        val queThree = Question(
            1,
            "Pattern3?",
            R.drawable.patternimg,
            "square",
            "circle",
            "triangle",
            "hexagon",
            "square"
        )

        val queFour = Question(
            1,
            "Pattern4?",
            R.drawable.patternimg,
            "square",
            "circle",
            "triangle",
            "hexagon",
            "square"
        )

        val queFive = Question(
            1,
            "Pattern5?",
            R.drawable.patternimg,
            "square",
            "circle",
            "triangle",
            "hexagon",
            "square"
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
            "math1?",
            R.drawable.mathimg,
            "1",
            "2",
            "3",
            "4",
            "1"
        )

        val queTwo = Question(
            1,
            "math2?",
            R.drawable.mathimg,
            "1",
            "2",
            "3",
            "4",
            "1"
        )

        val queThree = Question(
            1,
            "math3?",
            R.drawable.mathimg,
            "1",
            "2",
            "3",
            "4",
            "1"
        )

        val queFour = Question(
            1,
            "math4?",
            R.drawable.mathimg,
            "1",
            "2",
            "3",
            "4",
            "1"
        )

        val queFive = Question(
            1,
            "math5?",
            R.drawable.mathimg,
            "1",
            "2",
            "3",
            "4",
            "1"
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
            "story1?",
            R.drawable.storyimg,
            "1",
            "2",
            "3",
            "4",
            "1"
        )

        val queTwo = Question(
            1,
            "story2?",
            R.drawable.storyimg,
            "1",
            "2",
            "3",
            "4",
            "1"
        )

        val queThree = Question(
            1,
            "story3?",
            R.drawable.storyimg,
            "1",
            "2",
            "3",
            "4",
            "1"
        )

        val queFour = Question(
            1,
            "story4?",
            R.drawable.storyimg,
            "1",
            "2",
            "3",
            "4",
            "1"
        )

        val queFive = Question(
            1,
            "story5?",
            R.drawable.storyimg,
            "1",
            "2",
            "3",
            "4",
            "1"
        )


        cat4Questions.add(queOne)
        cat4Questions.add(queTwo)
        cat4Questions.add(queThree)
        cat4Questions.add(queFour)
        cat4Questions.add(queFive)



        return cat4Questions
    }



}