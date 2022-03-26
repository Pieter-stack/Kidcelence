package com.example.kidcelence

import android.Manifest
import android.accounts.AccountManager.get
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.graphics.Bitmap
import android.icu.text.SimpleDateFormat
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.kidcelence.databinding.ActivityMainBinding
import com.example.kidcelence.models.Constant
import com.karumi.dexter.Dexter
import com.karumi.dexter.DexterBuilder
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.DialogOnAnyDeniedMultiplePermissionsListener.Builder.withContext
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.karumi.dexter.listener.single.DialogOnDeniedPermissionListener.Builder.withContext


class MainActivity : AppCompatActivity() {

    //binding varible which will be the generated activity of our xml
    private lateinit var binding: ActivityMainBinding
    lateinit var dexter : DexterBuilder

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
//        Constant.setProfileImage(this,"")
    // find imageview and btn by id
        imageView = findViewById(R.id.shape_Profile)
        button = findViewById(R.id.btn_Image)
        button.setOnClickListener {
            getPermission()
        }






        var userName: String = ""

        //on btn click listener
        binding.btnSubmit.setOnClickListener {





            //update userName to input fields text
            userName = binding.etName.text.toString()






//1. SharedPref -profile img set in die main activity, kyk of op categories uri werk van daar af
//2. Internal Media Storage
//https://developer.android.com/training/data-storage/shared/media


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
                Constant.setUserName(this,userName)
                val intent = Intent(this, categories::class.java)

                //pass data to our next activity
              //  intent.putExtra(Constant.username, userName)

                startActivity(intent)
                finish() //removes current activity from stack

                //TODO : navigate to next activity
            }
        }

    }

    override fun onStart() {

        imageView.setImageURI(Uri.parse(Constant.getProfileImage(this )))
        super.onStart()
    }

    //show profilepic
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        var photo = null
        var imageurl = null
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
           val intent = Intent(this, categories::class.java)

            //pass data to our next activity


           // startActivity(intent)
          //  finish() //removes current activity from stack


            //TODO:save imageuri as shared prefrences en ook stuur na maion page deur intent
            //victory sound expand op sound

            imageView.setImageURI(imageUri)
            // store userprofile image in sharedPreferances
            Constant.setProfileImage(this, imageUri.toString())

            println("Imageuri " + imageUri)




        }
    }
    private fun getPermission() {
        Dexter.withContext(this)
            .withPermissions(
                android.Manifest.permission.READ_PHONE_STATE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            ).withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                    report.let {

                        if (!report.areAllPermissionsGranted()) {
                            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
                            startActivityForResult(gallery, pickImage)
                        }

                    }
                }

                override fun onPermissionRationaleShouldBeShown(permissions: List<PermissionRequest?>?, token: PermissionToken?) {
                    token?.continuePermissionRequest()
                }
            }).withErrorListener{
                Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
            }.check()
    }

}


//pfp
//https://www.tutorialspoint.com/how-to-pick-an-image-from-an-image-gallery-on-android-using-kotlin

//get sound
//https://abhiandroid.com/androidstudio/add-audio-android-studio.html