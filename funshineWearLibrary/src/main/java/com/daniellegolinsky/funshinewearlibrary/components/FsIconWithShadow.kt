package com.daniellegolinsky.funshinewearlibrary.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.Icon
import com.daniellegolinsky.funshinewearlibrary.R
import com.daniellegolinsky.funshinewearlibrary.designelements.getForegroundItemColor
import com.daniellegolinsky.funshinewearlibrary.designelements.getImageShadowAlpha
import com.daniellegolinsky.funshinewearlibrary.designelements.getShadowBlurRadius
import com.daniellegolinsky.funshinewearlibrary.designelements.getShadowXOffset
import com.daniellegolinsky.funshinewearlibrary.designelements.getShadowYOffset

/**
 * In the FunShine design language, data is "projected" above the screen. Like a physical hologram
 * It therefore casts a shadow. This allows you to make shadows for your drawables, for any shape
 * Please provide a content description with `imageResourceContentDescription`,
 *      make this null if it is not to be read out and purely for decoration only.
 */
@Composable
fun FsIconWithShadow(
    image: Painter,
    imageResourceContentDescription: String?,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = modifier.fillMaxWidth()
    ) {
        Icon(
            painter = image,
            contentDescription = null,
            tint = getForegroundItemColor(),
            modifier = Modifier
                .alpha(alpha = getImageShadowAlpha())
                .offset(
                    x = getShadowXOffset(),
                    y = getShadowYOffset()
                ) // TODO This will be an angle and customizable
                .blur(radius = getShadowBlurRadius())
                .padding(maxOf(getShadowXOffset(), getShadowYOffset())),
        )
        Icon(
            painter = image,
            contentDescription = imageResourceContentDescription,
            tint = getForegroundItemColor(),
            modifier = Modifier.padding(maxOf(getShadowXOffset(), getShadowYOffset())),
        )
    }
}

@Preview
@Composable
fun PreviewWeatherStatusImage() {
    FsIconWithShadow(
        image = painterResource(id = R.drawable.ic_circle_black),
        imageResourceContentDescription = "Circle"
    )
}