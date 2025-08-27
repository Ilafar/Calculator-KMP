package com.example.calculator.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColorScheme(
    surface = Color.White,
    primary = Color.White,
    onPrimary = Color(gray),
    onSecondary = Color(darkGreen)
)

private val DarkColorPalette = darkColorScheme(
    onSecondary = Color(orange),
    onPrimary = Color.White,
    surface = Color.Black,
    primary = Color.Black,

)

private val buttonShapes = Shapes(
    small = CircleShape,
    medium = CircleShape,
    large = CircleShape
)

@Composable
fun CalculatorTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
){
    val colors = if (darkTheme) DarkColorPalette else LightColorPalette
    MaterialTheme(
        colorScheme = colors,
        content = content,
        shapes = buttonShapes
    )
}