package com.daniellegolinsky.funshinetheme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daniellegolinsky.funshinetheme.designelements.getBackgroundColor
import com.daniellegolinsky.funshinetheme.designelements.getForegroundItemColor
import com.daniellegolinsky.themeresources.R

/**
 * "False" for optionTwoSelected will, obviously, mean option one is selected
 * This is a two-state switch, like the standard underlying "Switch()"
 * Start is off, end is on (left is off, right is on in a left-to-right orientation)
 */
@Composable
fun FsTwoStateSwitch(
    optionOneString: String,
    optionTwoString: String,
    optionTwoSelected: Boolean,
    modifier: Modifier = Modifier,
    onOptionChanged: ((Boolean) -> Unit)?
) {
    val accessibilityOutputString = stringResource(
        id = R.string.two_state_toggle_content_description,
        optionOneString,
        optionTwoString,
        getSelectedString(
            optionTwoSelected = optionTwoSelected,
            optionOneString = optionOneString,
            optionTwoString = optionTwoString
        )
    )

    val switchStateSelected = stringResource(
        id = R.string.two_state_toggle_status,
        getSelectedString(
            optionTwoSelected = optionTwoSelected,
            optionOneString = optionOneString,
            optionTwoString = optionTwoString
        )
    )

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .semantics(mergeDescendants = true) {
                contentDescription = accessibilityOutputString
                role = Role.Switch
            },
    ) {
        FsBodyTextWithoutShadow(
            text = optionOneString,
            maxLines = 1,
            modifier = Modifier.clearAndSetSemantics {},
        )
        Spacer(modifier = Modifier
            .width(8.dp)
            .clearAndSetSemantics {})
        Switch(
            checked = optionTwoSelected,
            colors = SwitchDefaults.colors(
                checkedThumbColor = getForegroundItemColor(),
                checkedTrackColor = getBackgroundColor(),
                checkedBorderColor = getForegroundItemColor(),
                uncheckedThumbColor = getForegroundItemColor(),
                uncheckedTrackColor = getBackgroundColor(),
                uncheckedBorderColor = getForegroundItemColor(),
            ),
            thumbContent = {},
            onCheckedChange = onOptionChanged,
            modifier = Modifier.semantics {
                stateDescription = switchStateSelected
            }
        )
        Spacer(modifier = Modifier
            .width(8.dp)
            .clearAndSetSemantics {})
        FsBodyTextWithoutShadow(
            text = optionTwoString,
            maxLines = 1,
            modifier = Modifier.clearAndSetSemantics {},
        )
    }
}

@Preview
@Composable
fun PreviewFsTwoStateSwitchOff() {
    FsTwoStateSwitch(
        optionOneString = "KMH",
        optionTwoString = "MPH",
        optionTwoSelected = false,
        onOptionChanged = {},
    )
}

@Preview
@Composable
fun PreviewFsTwoStateSwitchOn() {
    FsTwoStateSwitch(
        optionOneString = "KMH",
        optionTwoString = "MPH",
        optionTwoSelected = true,
        onOptionChanged = {},
    )
}

@Composable
private fun getSelectedString(
    optionTwoSelected: Boolean,
    optionOneString: String,
    optionTwoString: String,
): String {
    return if (optionTwoSelected) {
        optionTwoString
    } else {
        optionOneString
    }
}
