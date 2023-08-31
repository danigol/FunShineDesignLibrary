package com.daniellegolinsky.funshinewearlibrary.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.Text
import com.daniellegolinsky.funshinewearlibrary.designelements.getTextColor
import com.daniellegolinsky.funshinewearlibrary.font.getBodyFontStyle

/**
 * Text, like data and images, is "projected" above the screen in FunShine.
 * Isn't that fun?
 * This will automatically cast a shadow for your text.
 */
@Composable
fun FsWearText(
    text: String,
    maxLines: Int = 8, // TODO Make a constant/Style
    textStyle: TextStyle,
    textDecoration: TextDecoration? = null,
    modifier: Modifier = Modifier
) {
    Text(
        text,
        textAlign = TextAlign.Center,
//        color = getTextColor(),
        color = Color.Black,
        maxLines = maxLines,
        style = textStyle,
        textDecoration = textDecoration,
        modifier = modifier,
    )
}

@Preview
@Composable
fun PreviewFsWearText() {
    FsWearText(
        text = "This is some Funshine Text! Have fun in the sun! Or not!",
        textStyle = getBodyFontStyle()
    )
}