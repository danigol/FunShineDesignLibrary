package com.daniellegolinsky.funshinetheme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.CustomAccessibilityAction
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.customActions
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.daniellegolinsky.funshinetheme.R
import com.daniellegolinsky.funshinetheme.designelements.getBackgroundColor
import com.daniellegolinsky.funshinetheme.designelements.getForegroundItemColor

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
        if (optionTwoSelected) {
            optionTwoString
        } else {
            optionOneString
        }
    )
    val optionTwoSelectedString =
        stringResource(id = R.string.two_state_toggle_switch_description, optionTwoString)
    val optionOneSelectedString =
        stringResource(id = R.string.two_state_toggle_switch_description, optionOneString)

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .semantics(mergeDescendants = true) {
                customActions =
                    listOf(
                        CustomAccessibilityAction(accessibilityOutputString) { true } // TODO This will be a method that takes in the boolean switch
                    )
            },
    ) {
        FsBodyTextWithoutShadow(
            text = optionOneString,
            maxLines = 1,
        )
        Spacer(modifier = Modifier.width(8.dp))
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
                stateDescription = if (optionTwoSelected) {
                    optionTwoSelectedString
                } else {
                    optionOneSelectedString
                }
            }
        )
        Spacer(modifier = Modifier.width(8.dp))
        FsBodyTextWithoutShadow(
            text = optionTwoString,
            maxLines = 1,
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
