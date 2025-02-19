package com.example.design.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.themes.White

@Composable
fun TextComponent(
    text: String? = null,
    modifier: Modifier,
    textColor: Color = White,
    fontSize: TextUnit = 16.sp,
    paddingValue: Dp = 0.dp
) {
    text?.let {
        Text(
            text = text,
            modifier = modifier
                .padding(all = paddingValue),
            style = TextStyle(
                color = textColor,
                fontSize = fontSize
            ),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TextComponentPreview() {
    TextComponent("Olá",Modifier)
}