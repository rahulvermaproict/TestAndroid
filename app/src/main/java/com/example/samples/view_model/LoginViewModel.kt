package com.example.samples.view_model

import android.util.Log
import androidx.lifecycle.ViewModel

class LoginViewModel(val data: String) : ViewModel(){

    init {
        Log.d("TAG", "Login View Model $data ")
    }

    constructor( test: Int) : this("") {
        Log.d("TAG", "Login View Model secondary ")
    }
}