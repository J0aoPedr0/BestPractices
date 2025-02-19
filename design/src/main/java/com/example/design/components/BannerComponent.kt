package com.example.design.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.design.R
import com.example.design.themes.Black
import com.example.design.themes.primaryColor


@Composable
fun BannerComponent(
    title: String? = null,
    description:String? = null,
    imageUrl: String? = null,
    resourceValue: Int? = null,
) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(14.dp)
        .clip(shape = RoundedCornerShape(16.dp))
        .background(
            brush = Brush.horizontalGradient(
                colors = listOf(
                    primaryColor, Black
                )
            )
        )
    ) {

        imageUrl?.let {
        AsyncImage(
            modifier = Modifier.fillMaxSize(),
            model = imageUrl,
            contentDescription = "Image Banner",
            contentScale = ContentScale.Crop
        )
        }
        resourceValue?.let {
            ImageComponent(
                resourceValue = resourceValue,
                modifier = Modifier
                    .padding(18.dp)
                    .align(Alignment.CenterEnd),
                sizeImage = 80.dp
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(18.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start,
        ) {
            title?.let {
                TextComponent(
                    text = it,
                    modifier = Modifier.wrapContentSize(),
                    fontSize = 26.sp
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            description?.let {
                TextComponent(
                    text = it,
                    modifier = Modifier.wrapContentSize()
                    )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BannerComponentPreview() {
    BannerComponent(
        title = stringResource(R.string.wealth),
        description = stringResource(R.string.your_investments),
        imageUrl = null,
        resourceValue = R.drawable.wealth_icon
    )
}