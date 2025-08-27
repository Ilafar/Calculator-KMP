package com.example.calculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorPad() {
    val buttonSpacing = 8.dp
    val operationColor = MaterialTheme.colorScheme.onSecondary
    val deleteColor = MaterialTheme.colorScheme.onBackground
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 16.dp)
            .windowInsetsPadding(WindowInsets.safeDrawing),
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "AC",
                modifier = Modifier.weight(1f),
                textSize = 15.sp,
                textColor = deleteColor,
                onClick = {}
            )
            CalculatorButton(
                symbol = "⌫",
                modifier = Modifier.weight(1f),
                textColor = deleteColor,
                onClick = {}
            )
            CalculatorButton(
                symbol = "%",
                modifier = Modifier.weight(1f),
                textColor = operationColor,
                onClick = {}
            )
            CalculatorButton(
                symbol = "÷",
                modifier = Modifier.weight(1f),
                textColor = operationColor,
                onClick = {}
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "7",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "8",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "9",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "×",
                modifier = Modifier.weight(1f),
                textColor = operationColor,
                onClick = {}
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "4",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "5",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "6",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "-",
                textColor = operationColor,
                modifier = Modifier.weight(1f),
                onClick = {}
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "1",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "2",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "3",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "+",
                modifier = Modifier.weight(1f),
                textColor = operationColor,
                onClick = {}
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "±",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "0",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = ".",
                modifier = Modifier.weight(1f),
                onClick = {}
            )
            CalculatorButton(
                symbol = "=",
                textColor = operationColor,
                modifier = Modifier.weight(1f),
                onClick = {}
            )
        }
    }
}
