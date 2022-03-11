package com.example.kidcelence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kidcelence.databinding.ActivityCategoriesBinding
import com.example.kidcelence.databinding.ActivityMainBinding


class categories : AppCompatActivity() {

    //binding varible which will be the generated activity of our xml
    private lateinit var binding: ActivityCategoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //bind our activity to the root of this xml file
        binding = ActivityCategoriesBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)




    }


}