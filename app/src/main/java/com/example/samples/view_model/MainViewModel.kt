package com.example.samples.view_model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData


class MainViewModel(application: Application) : AndroidViewModel(application){

    val mNextClicked: MutableLiveData<String> = MutableLiveData()
    val mExitClicked: MutableLiveData<String> = MutableLiveData()


}