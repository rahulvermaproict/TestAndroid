package com.example.samples.view_model_factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.samples.view_model.LoginViewModel

class LoginViewModelFactory(val data:String): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            LoginViewModel(this.data) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}