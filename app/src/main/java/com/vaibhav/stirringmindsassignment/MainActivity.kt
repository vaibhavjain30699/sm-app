package com.vaibhav.stirringmindsassignment

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onBackPressed() {
//        super.onBackPressed()
        val builder = AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which -> this.finish() })
                .setNegativeButton("No",DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
        builder.create()
        builder.show()
    }

}