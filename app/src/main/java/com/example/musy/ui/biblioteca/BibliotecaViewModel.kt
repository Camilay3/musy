package com.example.musy.ui.biblioteca

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BibliotecaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is BIBLIOTECA Fragment"
    }
    val text: LiveData<String> = _text
}