package com.example.samples.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.samples.R
import com.example.samples.view_model.LoginViewModel
import com.example.samples.view_model_factory.LoginViewModelFactory

class LoginActivity : AppCompatActivity() {
    private val TAG = "LoginActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginViewModel = ViewModelProvider(this,LoginViewModelFactory("Test"))[LoginViewModel::class.java]
//        val loginViewModel : LoginViewModel by viewModels()

        LoginViewModel(1)

        Log.d(TAG, "LifeCycle onCreate ${loginViewModel.hashCode()}")
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