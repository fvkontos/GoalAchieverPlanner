package com.example.goalachieverplanner.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryPurple,
    onPrimary = OnPrimaryWhite,
    primaryContainer = PrimaryPurple,
    secondary = TextSecondaryGrey,
    background = TextPrimaryDark,
    surface = TextPrimaryDark,
    onBackground = OnPrimaryWhite,
    onSurface = OnPrimaryWhite
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryPurple,
    onPrimary = OnPrimaryWhite,
    primaryContainer = PrimaryContainerLight,
    secondary = TextSecondaryGrey,
    background = BackgroundSubtle,
    surface = SurfaceWhite,
    onBackground = TextPrimaryDark,
    onSurface = TextPrimaryDark
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
