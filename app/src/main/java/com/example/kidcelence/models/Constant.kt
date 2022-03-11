package com.example.kidcelence.models

import com.example.kidcelence.R

object Constant {

    fun CategoryOneQuestions(): ArrayList<Question>{

        //init question array
        var cat1Questions = ArrayList<Question>()

        //create q
val queOne = Question(
    1,
    "What sound is this animal from?",
    R.drawable.animalimg,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)

val queTwo = Question(
    1,
    "What sound is this animal from?",
    R.drawable.animalimg,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)

val queThree = Question(
    1,
    "What sound is this animal from?",
    R.drawable.animalimg,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)

val queFour = Question(
    1,
    "What sound is this animal from?",
    R.drawable.animalimg,
    "Cow",
    "Chicken",
    "Pig",
    "Sheep",
    "Cow"
)

val queFive = Question(
    1,
    "What sound is this animal from?",
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




}