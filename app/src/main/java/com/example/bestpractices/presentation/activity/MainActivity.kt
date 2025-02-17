package com.example.bestpractices.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.bestpractices.presentation.screens.home.HomeScreen
import com.example.bestpractices.presentation.screens.screen_navigation.AppScreenNavigation
import com.example.bestpractices.presentation.theme.BestPracticesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        installSplashScreen()
        setContent {
            BestPracticesTheme {
                AppScreenNavigation()
            }
        }
    }
}