package com.daniellegolinsky.funshinewearlibrary.designelements

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.daniellegolinsky.funshinewearlibrary.R

@Composable
fun getBackgroundColor(isBackgroundDark: Boolean = false): Color {
    return if (isBackgroundDark) colorResource(id = R.color.gray_800) else colorResource(id = R.color.gray_100)
}

@Composable
fun getTextColor(isBackgroundDark: Boolean = false): Color {
    return if (isBackgroundDark) colorResource(id = R.color.white) else colorResource(id = R.color.black)
}

@Composable
fun getForegroundItemColor(isBackgroundDark: Boolean = false): Color {
    return if (isBackgroundDark) colorResource(id = R.color.white) else colorResource(id = R.color.black)
}

@Composable
fun getShadowAlpha(isBackgroundDark: Boolean = false): Float {
    return if (isBackgroundDark) 0.8f else 0.15f
}

@Composable
fun getImageShadowAlpha(isBackgroundDark: Boolean = false): Float {
    return if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
        if (isBackgroundDark) 0.65f else 0.025f
    } else {
        if (isBackgroundDark) 0.8f else 0.15f
    }
}
