package com.example.kidcelence

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kidcelence.databinding.ActivityMainBinding
import com.example.kidcelence.models.Constant
import java.io.File


class MainActivity : AppCompatActivity() {

    //binding varible which will be the generated activity of our xml
    private lateinit var binding: ActivityMainBinding

//pfp variables declare
    lateinit var imageView: ImageView
    lateinit var button: Button
    private val pickImage = 100
    private var imageUri: Uri? = null


    //on create function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //bind our activity to the root of this xml file
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

    // find imageview and btn by id
        imageView = findViewById(R.id.shape_Profile)
        button = findViewById(R.id.btn_Image)
        button.setOnClickListener {
            // pick image from gallery
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        }







        var userName: String = ""
        var profilePic: String = ""

        //on btn click listener
        binding.btnSubmit.setOnClickListener {





            //update userName to input fields text
            userName = binding.etName.text.toString()
            profilePic = imageUri.toString()


            //validation: check if name has been entered

            if (userName == "") {

                //TODO: add colour if not entered : textbox

                // create toast message
                val toast = Toast.makeText(
                    applicationContext, "Please enter your name to continue",
                    Toast.LENGTH_SHORT
                )
                //Show toast message
                toast.show()
            } else {
                println(userName)

                //navigate to next activity using intent
                val intent = Intent(this, categories::class.java)

                //pass data to our next activity
                intent.putExtra(Constant.username, userName)
                intent.putExtra(Constant.profilepic, profilePic)

                startActivity(intent)
                finish() //removes current activity from stack

                //TODO : navigate to next activity
            }
        }

    }

    //show profilepic
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        var photo = null
        var imageurl = null
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
            imageView.setImageURI(imageUri)
            println("Imageuri " + imageUri)




        }
    }
}


//pfp
//https://www.tutorialspoint.com/how-to-pick-an-image-from-an-image-gallery-on-android-using-kotlin

//get sound
//https://abhiandroid.com/androidstudio/add-audio-android-studio.html