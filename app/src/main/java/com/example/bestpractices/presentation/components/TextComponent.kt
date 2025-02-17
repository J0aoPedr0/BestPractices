package com.example.bestpractices.presentation.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.bestpractices.presentation.theme.Black
import com.example.bestpractices.presentation.theme.White

@Composable
fun TextComponent(
    text: String,
    modifier: Modifier,
    textColor: Color = White,
    fontSize: TextUnit = 16.sp
) {
    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            color = textColor,
            fontSize = fontSize),
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
private fun TextComponentPreview() {
    TextComponent("Olá",Modifier)
}