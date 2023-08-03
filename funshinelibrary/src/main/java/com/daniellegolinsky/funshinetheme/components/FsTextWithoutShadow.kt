package com.daniellegolinsky.funshinetheme.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.daniellegolinsky.funshinetheme.designelements.getTextColor
import com.daniellegolinsky.funshinetheme.font.getBodyFontStyleWithoutShadow

/**
 * Text, like data and images, is "projected" above the screen in FunShine.
 * Isn't that fun?
 * This will automatically cast a shadow for your text.
 */
@Composable
fun FsBodyTextWithoutShadow(
    text: String,
    maxLines: Int = 8,
    modifier: Modifier = Modifier
) {
    Text(
        text,
        textAlign = TextAlign.Center,
        color = getTextColor(),
        maxLines = maxLines,
        style = getBodyFontStyleWithoutShadow(),
        modifier = modifier,
    )
}

@Preview
@Composable
fun PreviewFsBodyTextWithoutShadow() {
    FsBodyTextWithoutShadow(
        text = "This is some Funshine Text! Have fun in the sun! Or not!",
    )
}