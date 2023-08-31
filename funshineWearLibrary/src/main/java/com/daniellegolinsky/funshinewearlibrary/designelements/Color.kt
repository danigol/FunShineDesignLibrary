package com.daniellegolinsky.funshinewearlibrary.designelements

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.daniellegolinsky.themeresources.R

@Composable
fun getBackgroundColor(): Color {
    return if (isSystemInDarkTheme()) colorResource(id = R.color.gray_800) else colorResource(id = R.color.gray_100)
}

@Composable
fun getTextColor(): Color {
    return if (isSystemInDarkTheme()) colorResource(id = R.color.white) else colorResource(id = R.color.black)
}

@Composable
fun getForegroundItemColor(): Color {
    return if (isSystemInDarkTheme()) colorResource(id = R.color.white) else colorResource(id = R.color.black)
}

@Composable
fun getShadowAlpha(): Float {
    return if (isSystemInDarkTheme()) 0.75f else 0.15f
}
