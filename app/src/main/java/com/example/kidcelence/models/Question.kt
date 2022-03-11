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
