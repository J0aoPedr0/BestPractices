package com.example.bestpractices.presentation.screens.screen_navigation

sealed class Routes (val route: String) {

    data object HomeScreen: Routes(route = "home_screen")
    data object WealthHomeScreen: Routes(route = "wealth_home_screen")
}