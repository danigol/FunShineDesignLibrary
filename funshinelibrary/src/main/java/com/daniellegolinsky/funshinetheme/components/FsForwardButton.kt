package com.daniellegolinsky.funshinetheme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daniellegolinsky.funshinetheme.R
import com.daniellegolinsky.funshinetheme.designelements.getForegroundItemColor
import com.daniellegolinsky.funshinetheme.designelements.getTextColor
import com.daniellegolinsky.funshinetheme.font.getBodyFontStyleWithoutShadow

@Composable
fun FsForwardButton(
    buttonText: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.clickable(role = Role.Button) { onClick() }
    ) {
        Text(
            text = buttonText,
            textAlign = TextAlign.Center,
            color = getTextColor(),
            maxLines = 1,
            style = getBodyFontStyleWithoutShadow(),
            modifier = Modifier.padding(bottom = 2.dp),
        )
        Spacer(modifier = Modifier.width(2.dp))
        Icon(
            painter = painterResource(id = R.drawable.ic_arrow_right_black), 
            contentDescription = stringResource(id = R.string.forward_button_content_description),
            tint = getForegroundItemColor(),
            modifier = Modifier.height(20.dp)
        )
    }
}

@Preview
@Composable
fun PreviewFsForwardButton() {
    FsForwardButton(buttonText = "Let's check this out") {}
}
