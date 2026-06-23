package com.example.goalachieverplanner.designsystem.components.buttons

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.goalachieverplanner.designsystem.theme.AppTheme

@Composable
fun AppPrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled
    ) {
        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun AppPrimaryButtonPreview() {
    AppTheme {
        AppPrimaryButton(text = "Click Me", onClick = {})
    }
}
