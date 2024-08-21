package com.example.mvvm08012024

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel(private var context: Context): ViewModel() {
    var text = ""

    fun printContext() {
        Log.d("pphat", context.toString())
    }
}