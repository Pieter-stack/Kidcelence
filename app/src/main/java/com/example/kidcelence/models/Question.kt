package com.example.kidcelence.models

data class Question(
    val id: Int,
    val question: String,
    val icon: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val answer: String
)


data class QuestionPattern(
    val id: Int,
    val question: String,
    val icon: Int,
    val optionOne: Int,
    val optionTwo: Int,
    val optionThree: Int,
    val optionFour: Int,
    val answer: Int
)
