package com.example.bestpractices.presentation.screens.screen_navigation

import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bestpractices.presentation.screens.home.HomeScreen
import com.example.wealth.presentation.screens.WealthHomeScreen

@Composable
fun AppScreenNavigation() {
    val navController = rememberNavController()

    Surface (Modifier.fillMaxSize()){
        NavHost(
            navController = navController,
            startDestination = Routes.WealthHomeScreen.route
        ) {
            composable(route = Routes.HomeScreen.route){
                HomeScreen()
            }
            composable(route = Routes.WealthHomeScreen.route){
                WealthHomeScreen()
            }
        }
    }
}