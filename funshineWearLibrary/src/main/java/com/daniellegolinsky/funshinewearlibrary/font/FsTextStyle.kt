package com.daniellegolinsky.funshinewearlibrary.font

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.MaterialTheme.typography
import com.daniellegolinsky.funshinewearlibrary.R
import com.daniellegolinsky.funshinewearlibrary.designelements.ThemeConstants
import com.daniellegolinsky.funshinewearlibrary.designelements.getShadowAlpha
import com.daniellegolinsky.funshinewearlibrary.font.FsWearTextStyle.BODY_FONT_SIZE
import com.daniellegolinsky.funshinewearlibrary.font.FsWearTextStyle.BODY_FONT_WEIGHT
import com.daniellegolinsky.funshinewearlibrary.font.FsWearTextStyle.BUTTON_FONT_SIZE
import com.daniellegolinsky.funshinewearlibrary.font.FsWearTextStyle.BUTTON_FONT_WEIGHT
import com.daniellegolinsky.funshinewearlibrary.font.FsWearTextStyle.HEADING_FONT_SIZE
import com.daniellegolinsky.funshinewearlibrary.font.FsWearTextStyle.HEADING_FONT_WEIGHT

object FsWearTextStyle {
    const val BODY_FONT_WEIGHT: Int = 450
    const val HEADING_FONT_WEIGHT: Int = 600
    const val BODY_FONT_SIZE: Int = 16
    const val HEADING_FONT_SIZE: Int = 28
    const val BUTTON_FONT_WEIGHT: Int = 450
    const val BUTTON_FONT_SIZE: Int = 20
    const val MAX_LINES_HEADING: Int = 1
    const val MAX_LINES_CONTROLS: Int = 1
    const val MAX_LINES_BODY: Int = 8
}

@Composable
fun getBodyFontStyle(): TextStyle {
    return typography.body1.copy(
        shadow = Shadow(
//            color = colorResource(id = R.color.black).copy(alpha = getShadowAlpha()),
            color = Color.Black.copy(alpha = getShadowAlpha()),
            offset = Offset(
                x = ThemeConstants.SHADOW_OFFSET_X_FLOAT,
                y = ThemeConstants.SHADOW_OFFSET_Y_FLOAT
            ),
            blurRadius = ThemeConstants.SHADOW_BLUR_RADIUS
        ),
        fontWeight = FontWeight(BODY_FONT_WEIGHT),
        fontSize = BODY_FONT_SIZE.sp
    )
}

@Composable
fun getBodyFontStyleWithoutShadow(): TextStyle {
    return typography.body1.copy(
        fontWeight = FontWeight(BODY_FONT_WEIGHT),
        fontSize = BODY_FONT_SIZE.sp
    )
}

@Composable
fun getHeadingFontStyle(): TextStyle {
    return typography.body1.copy(
        shadow = Shadow(
            color = colorResource(id = R.color.black).copy(alpha = getShadowAlpha()),
            offset = Offset(
                x = ThemeConstants.SHADOW_OFFSET_X_FLOAT,
                y = ThemeConstants.SHADOW_OFFSET_Y_FLOAT
            ),
            blurRadius = ThemeConstants.SHADOW_BLUR_RADIUS
        ),
        fontWeight = FontWeight(HEADING_FONT_WEIGHT),
        fontSize = HEADING_FONT_SIZE.sp
    )
}

@Composable
fun getHeadingFontStyleWithoutShadow(): TextStyle {
    return typography.body1.copy(
        fontWeight = FontWeight(HEADING_FONT_WEIGHT),
        fontSize = HEADING_FONT_SIZE.sp
    )
}

@Composable
fun getButtonTextStyle(): TextStyle {
    return typography.body1.copy(
        fontWeight = FontWeight(BUTTON_FONT_WEIGHT),
        fontSize = BUTTON_FONT_SIZE.sp
    )
}
