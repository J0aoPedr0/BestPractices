package com.example.utilities.logging

import android.util.Log

object AppLogger {

    private const val TAG = "AppLogger"
    fun d(tag: String = TAG, message: String){
            Log.d(tag, message)
    }

    fun e(tag: String = TAG, message: String){
            Log.e(tag, message)
    }
}