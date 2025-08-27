package com.example.calculator.ui.components

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    textSize: TextUnit = 36.sp,
    textColor: Color = MaterialTheme.colorScheme.onPrimary,
    onClick: () -> Unit
){
    Button(
        onClick = onClick,
        modifier = modifier.aspectRatio(1f)
    ){
        Text(
            text = symbol,
            fontSize = textSize,
            color = textColor
        )
    }
}
