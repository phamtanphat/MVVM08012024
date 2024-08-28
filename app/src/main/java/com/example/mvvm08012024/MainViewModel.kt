package com.example.mvvm08012024

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private var context: Context): ViewModel() {
    private var textLiveData = MutableLiveData<String>()

    fun getTextLiveData(): LiveData<String> {
        return textLiveData
    }

    fun setText(text: String) {
        textLiveData.value = text
    }
}