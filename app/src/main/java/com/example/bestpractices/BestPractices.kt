package com.example.bestpractices

import android.app.Application
import android.util.Log
import com.example.utilities.logging.AppLogger
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BestPractices: Application() {
    override fun onCreate() {
        super.onCreate()
        AppLogger.d(message = "Application is launched")
    }

    companion object{
        const val TAG = "BestPractices"
    }
}