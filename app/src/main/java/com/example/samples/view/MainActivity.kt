package com.example.samples.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.samples.R

class MainActivity : AppCompatActivity() {

    private val TAG ="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "LifeCycle onCreate ")
    }

    fun onNextClick(view: View){
        val intent = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "LifeCycle onStart ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "LifeCycle onResume ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "LifeCycle onPause ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "LifeCycle onStop ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "LifeCycle onDestroy ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "LifeCycle onRestart ")
    }
}