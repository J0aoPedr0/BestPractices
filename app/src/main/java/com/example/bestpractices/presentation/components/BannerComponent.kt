package com.example.bestpractices.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.bestpractices.presentation.theme.Black
import com.example.bestpractices.presentation.theme.Purple40

@Composable
fun BannerComponent(
    title: String? = null,
    description:String? = null,
    imageUrl: String? = null
) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(180.dp)
        .padding(14.dp)
        .clip(shape = RoundedCornerShape(16.dp)),
    ) {

        AsyncImage(
            modifier = Modifier.fillMaxSize(),
            model =imageUrl,
            contentDescription = "Image Banner",
            contentScale = ContentScale.Crop)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter)
                .clip(shape = RoundedCornerShape(16.dp)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
        ) {
            title?.let {
                TextComponent(
                    text = it,
                    modifier = Modifier
                        .padding(8.dp),
                    fontSize = 26.sp
                )
            }

            description?.let {
                TextComponent(
                    text = it,
                    modifier = Modifier
                        .padding(8.dp)
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BannerComponentPreview() {
    BannerComponent(
        title = "Olá",
        description = "Olá")
}