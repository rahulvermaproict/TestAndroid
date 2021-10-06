package com.example.samples.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.samples.R
import com.example.samples.view_model.MainViewModel

class MainActivity : AppCompatActivity() {

    private val TAG ="MainActivity"
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel : MainViewModel by viewModels()
        Log.d(TAG,"LifeCycle ViewModel $mainViewModel")
        Log.d(TAG, "LifeCycle onCreate ")
        this.mainViewModel = mainViewModel

        setObservers()
    }

    fun setObservers(){
        mainViewModel.mNextClicked.observe(this, Observer {
            Log.d(TAG,"LifeCycle livedata Next $it")
        })

        mainViewModel.mExitClicked.observe(this, Observer {
            Log.d(TAG,"LifeCycle livedata Exit $it")
        })
    }

    fun onNextClick(view: View){
        mainViewModel.mNextClicked.value = "click set value"
        mainViewModel.mExitClicked.postValue("click post value")
        val intent = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "LifeCycle onStart ")

       // mainViewModel.mNextClicked.value = "start set value"
       // mainViewModel.mExitClicked.postValue("start post value")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "LifeCycle onResume ")
        //mainViewModel.mNextClicked.value = "Resume set value"
       // mainViewModel.mExitClicked.postValue("Resume post value")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "LifeCycle onPause ")
       // mainViewModel.mNextClicked.value = "Pause set value"
//        mainViewModel.mExitClicked.postValue("Pause post value")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "LifeCycle onStop ")
        mainViewModel.mNextClicked.value = "Stop set value"
        mainViewModel.mExitClicked.postValue("Stop post value")
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