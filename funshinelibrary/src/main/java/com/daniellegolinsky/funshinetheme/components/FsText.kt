package com.daniellegolinsky.funshinetheme.components

import androidx.compose.foundation.layout.offset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daniellegolinsky.funshinetheme.designelements.ThemeConstants.SHADOW_BLUR_RADIUS_QUARTER
import com.daniellegolinsky.funshinetheme.designelements.getTextColor
import com.daniellegolinsky.funshinetheme.font.FsTextStyle.MAX_LINES_BODY
import com.daniellegolinsky.funshinetheme.font.getBodyFontStyle

/**
 * Text, like data and images, is "projected" above the screen in FunShine.
 * Isn't that fun?
 * This will automatically cast a shadow for your text.
 */
@Composable
fun FsText(
    text: String,
    textStyle: TextStyle,
    modifier: Modifier = Modifier,
    textAlign: TextAlign = TextAlign.Center,
    maxLines: Int = MAX_LINES_BODY,
    textDecoration: TextDecoration? = null,
) {
    Text(
        text,
        textAlign = textAlign,
        color = getTextColor(),
        maxLines = maxLines,
        style = textStyle,
        textDecoration = textDecoration,
        modifier = modifier,
    )
}

@Preview
@Composable
fun PreviewFsText() {
    FsText(
        text = "This is some Funshine Text! Have fun in the sun! Or not!",
        textStyle = getBodyFontStyle()
    )
}