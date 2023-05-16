package com.example.musy.ui.pesquisar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PesquisarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is PESQUISAR Fragment"
    }
    val text: LiveData<String> = _text
}