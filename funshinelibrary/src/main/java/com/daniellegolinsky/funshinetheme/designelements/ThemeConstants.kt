package com.daniellegolinsky.funshinetheme.designelements

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.daniellegolinsky.funshinetheme.designelements.ThemeConstants.SHADOW_BLUR_RADIUS
import com.daniellegolinsky.funshinetheme.designelements.ThemeConstants.SHADOW_BLUR_RADIUS_HALF
import com.daniellegolinsky.funshinetheme.designelements.ThemeConstants.SHADOW_OFFSET_X
import com.daniellegolinsky.funshinetheme.designelements.ThemeConstants.SHADOW_OFFSET_Y

object ThemeConstants {
    const val SHADOW_OFFSET_X = 40.0f
    const val SHADOW_OFFSET_Y = 40.0f
    const val SHADOW_OFFSET_X_HALF = 20.0f
    const val SHADOW_OFFSET_Y_HALF = 20.0f
    const val SHADOW_OFFSET_X_QUARTER = 10.0f
    const val SHADOW_OFFSET_Y_QUARTER = 10.0f
    const val SHADOW_BLUR_RADIUS = 12.0f
    const val SHADOW_BLUR_RADIUS_HALF = 6.0f
}

// TODO these will eventually be defined differently to define degrees for a cast shadow
fun getDefaultShadowOffset(): DpOffset = DpOffset(x = getShadowXOffset(), y= getShadowYOffset())

fun getShadowXOffset(): Dp {
    return SHADOW_OFFSET_X.dp
}

fun getShadowYOffset(): Dp {
    return SHADOW_OFFSET_Y.dp
}

fun getDefaultShadowBlurRadius(): Dp {
    return SHADOW_BLUR_RADIUS.dp
}

fun getShadowBlurRadius(imageSize: Dp): Dp {
    return if (imageSize < 64.dp) {
        SHADOW_BLUR_RADIUS_HALF.dp
    } else {
        SHADOW_BLUR_RADIUS.dp
    }
}