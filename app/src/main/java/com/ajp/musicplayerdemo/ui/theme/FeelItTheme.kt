package com.ajp.musicplayerdemo.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FeelItTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (isDarkTheme) DarkColors else LightColors

    MaterialTheme(
        typography = Typography,
        colors = colors,
        shapes = Shapes,
        content = content
    )
}


// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)


val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

/**
 * Decide these theme colors
 */
val LightColors = lightColors(
    primary = BahamaBlue,
    primaryVariant = BahamaBlue,
    secondary = DoveGray,
    onPrimary = Color.White,
    onSecondary = Color.White,
    surface = Color.White,
    onSurface = JetBlack,
    background = Color.White,
    onBackground = JetBlack,
    error = Rose,
    onError = Color.Red
)

val DarkColors = darkColors(
    primary = ReadModeWhite,
    primaryVariant = BahamaBlue,
    secondary = ReadModeWhite.copy(alpha = .9f),
    onPrimary = ReadModeDark1,
    onSecondary = Color.White,
    surface = ReadModeDark2,
    onSurface = ReadModeWhite,
    background = ReadModeDark2,
    onBackground = ReadModeWhite,
    error = Rose,
    onError = Color.Red
)
