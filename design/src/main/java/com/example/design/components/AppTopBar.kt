package com.example.design.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.R
import com.example.design.themes.White
import com.example.design.themes.primaryColor


@Composable
fun AppTopBar(
    title: String? = null,
    firstImageVector: ImageVector? = null,
    secondImageVector: ImageVector? = null,
) {
    Row(
        Modifier
            .fillMaxWidth()
            .systemBarsPadding()
            .height(70.dp)
            .background(primaryColor)
            .padding(start = 18.dp, end = 18.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center  )
    {
        firstImageVector?.let {
            Icon(
                modifier = Modifier
                    .size(28.dp),
                imageVector = firstImageVector,
                contentDescription = stringResource(R.string.left_icon_top_bar),
                tint = White
            )
        }

        Spacer(modifier = Modifier.width(18.dp))

        TextComponent(
            text = title,
            modifier = Modifier.wrapContentSize(),
            fontSize = 22.sp,
        )
        Spacer(modifier = Modifier.weight(1f))

        secondImageVector?.let {
            Icon(
                modifier = Modifier.size(28.dp),
                imageVector = secondImageVector,
                contentDescription = stringResource(R.string.right_icon_top_bar),
                tint = White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppTopBarPreview() {
    AppTopBar()
}