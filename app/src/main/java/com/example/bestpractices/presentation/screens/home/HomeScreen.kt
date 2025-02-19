package com.example.bestpractices.presentation.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bestpractices.R
import com.example.design.components.AppTopBar
import com.example.design.components.BannerComponent
import com.example.design.themes.White

@Composable
fun HomeScreen() {
    Scaffold(
        topBar =
        { AppTopBar(title = "add address",
            firstImageVector = Icons.Filled.Person,
            secondImageVector = Icons.Filled.Notifications
        ) })
    { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopStart)
                .background(White)
                .padding(innerPadding)
        )
        {
            BannerComponent(
                title = stringResource(com.example.design.R.string.wealth),
                description = stringResource(com.example.design.R.string.your_investments),
                imageUrl = null,
                resourceValue = R.drawable.wealth_icon
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}