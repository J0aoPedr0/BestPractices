package com.example.wealth.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.design.components.AppTopBar
import com.example.design.themes.White

@Composable
fun WealthHomeScreen() {
    Scaffold(
        topBar =
        { AppTopBar(title = "Wealth",
            firstImageVector = Icons.Filled.ArrowBack) })
    { innerPadding ->
        Column(
            content = { },
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopStart)
                .background(White)
                .padding(innerPadding)
        )
    }
}

@Preview
@Composable
private fun WealthHomeScreenPreview() {
    WealthHomeScreen()
}