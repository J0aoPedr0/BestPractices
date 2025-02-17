package com.example.bestpractices.presentation.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.bestpractices.presentation.components.AppTopBar
import com.example.bestpractices.presentation.components.BannerComponent
import com.example.bestpractices.presentation.theme.Purple80
import com.example.bestpractices.presentation.theme.White

@Composable
fun HomeScreen() {

    Scaffold(topBar = { AppTopBar() })
    {
        innerPadding ->
        Column(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopStart)
            .background(White)
            .padding(innerPadding))
        {
            BannerComponent(title = "Olá mundo",
                description = "Descrição do Banner",
                imageUrl = "https://i.ibb.co/1Y5TvH2Z/image-Background.webp")
        }
    }


}



@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}