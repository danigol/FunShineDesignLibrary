package com.daniellegolinsky.funshinetheme.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daniellegolinsky.funshinetheme.font.getHeadingFontStyleWithoutShadow

/**
 * TopAppBar still requires experimental APIs, leaving as a "pseudo AppBar" for now,
 *      a composable row. Will be a TopAppBar implementation eventually.
 */
@Composable
fun FsAppBar(
    headingText: String? = null,
    modifier: Modifier = Modifier,
    backButtonAction: () -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth()
    ) {
        FsBackButton() {
            backButtonAction()
        }
        headingText?.let {heading ->
            Spacer(modifier = Modifier.width(2.dp))
            FsBodyTextWithoutShadow(
                text = heading,
                maxLines = 1,
                style = getHeadingFontStyleWithoutShadow(),
                modifier = Modifier.semantics { heading() },
            )
        }
    }
}

@Preview
@Composable
fun PreviewFsAppBar() {
    FsAppBar(headingText = "Heading"){}
}
