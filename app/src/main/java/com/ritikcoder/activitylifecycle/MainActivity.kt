package com.ritikcoder.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG= "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.d(TAG, "onCreate")
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity2::class.java))
        }, 1000)

    }

    override fun onStart() {
        super.onStart()
        //Log.d(TAG, "onStart")
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        //Log.d(TAG, "onResume")
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        //Log.d(TAG, "onPause")
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        //Log.d(TAG, "onStop")
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        //Log.d(TAG, "onRestart")
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        //Log.d(TAG, "onDestroy")
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }

}