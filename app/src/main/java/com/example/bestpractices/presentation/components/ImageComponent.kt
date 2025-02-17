package com.example.bestpractices.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.bestpractices.R

@Composable
fun ImageComponent(
    modifier: Modifier,
    resourceValue: Int,
    sizeImage: Dp = 20.dp
) {
    Image(
        painter = painterResource(id = resourceValue),
        contentDescription = "Icon",
        modifier = modifier
            .size(sizeImage))
}

@Preview(showBackground = true)
@Composable
private fun ImageComponentPreview() {
    ImageComponent(
        resourceValue = R.drawable.wealth_icon,
        modifier = Modifier)
}