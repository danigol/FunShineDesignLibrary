package com.daniellegolinsky.funshinewearlibrary.designelements

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.daniellegolinsky.funshinewearlibrary.R

@Composable
fun getBackgroundColor(isDarkColor: Boolean = false): Color {
    return if (isDarkColor) colorResource(id = R.color.gray_800) else colorResource(id = R.color.gray_100)
}

@Composable
fun getTextColor(isDarkColor: Boolean = false): Color {
    return if (isDarkColor) colorResource(id = R.color.white) else colorResource(id = R.color.black)
}

@Composable
fun getForegroundItemColor(isDarkColor: Boolean = false): Color {
    return if (isDarkColor) colorResource(id = R.color.white) else colorResource(id = R.color.black)
}

@Composable
fun getShadowAlpha(isDarkColor: Boolean = false): Float {
    return if (isDarkColor) 0.75f else 0.15f
}
