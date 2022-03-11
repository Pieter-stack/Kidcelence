package com.example.kidcelence

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.kidcelence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //binding varible which will be the generated activity of our xml
    private lateinit var binding: ActivityMainBinding

//pfp variables declare
    lateinit var imageView: ImageView
    lateinit var button: Button
    private val pickImage = 100
    private var imageUri: Uri? = null

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
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        }







        var userName: String = ""

        //on btn click listener
        binding.btnSubmit.setOnClickListener {


            // SOund plays, and also this code is for animal sound on category page so move
            //TODO: move this code to caategory when need code!!!!!!!
            val ring: MediaPlayer = MediaPlayer.create(this, R.raw.sound)
            ring.start()




            //update userName to input fields text
            userName = binding.etName.text.toString()

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

                //TODO : navigate to next activity
            }
        }

    }

    //show profilepic
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
            imageView.setImageURI(imageUri)

            println(imageUri)
        }
    }
}


//pfp
//https://www.tutorialspoint.com/how-to-pick-an-image-from-an-image-gallery-on-android-using-kotlin

//get sound
//https://abhiandroid.com/androidstudio/add-audio-android-studio.html