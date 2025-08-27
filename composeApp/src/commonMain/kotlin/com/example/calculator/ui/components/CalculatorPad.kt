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
import com.example.calculator.CalculatorAction
import com.example.calculator.CalculatorOperation
import com.example.calculator.ExpressionState

@Composable
fun CalculatorPad(state: ExpressionState, onAction: (CalculatorAction) -> Unit) {
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
                textSize = 24.sp,
                textColor = deleteColor,
                onClick = {
                    onAction(CalculatorAction.Clear)
                }
            )
            CalculatorButton(
                symbol = "⌫",
                modifier = Modifier.weight(1f),
                textColor = deleteColor,
                onClick = {
                    onAction(CalculatorAction.Delete)
                }
            )
            CalculatorButton(
                symbol = "%",
                modifier = Modifier.weight(1f),
                textColor = operationColor,
                onClick = {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Percentage))
                }
            )
            CalculatorButton(
                symbol = "÷",
                modifier = Modifier.weight(1f),
                textColor = operationColor,
                onClick = {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                }
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "7",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(7))
                }
            )
            CalculatorButton(
                symbol = "8",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(8))
                }
            )
            CalculatorButton(
                symbol = "9",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(9))
                }
            )
            CalculatorButton(
                symbol = "×",
                modifier = Modifier.weight(1f),
                textColor = operationColor,
                onClick = {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                }
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "4",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(4))
                }
            )
            CalculatorButton(
                symbol = "5",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(5))
                }
            )
            CalculatorButton(
                symbol = "6",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(6))
                }
            )
            CalculatorButton(
                symbol = "-",
                textColor = operationColor,
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                }
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "1",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(1))
                }
            )
            CalculatorButton(
                symbol = "2",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(2))
                }
            )
            CalculatorButton(
                symbol = "3",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(3))
                }
            )
            CalculatorButton(
                symbol = "+",
                modifier = Modifier.weight(1f),
                textColor = operationColor,
                onClick = {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                }
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            CalculatorButton(
                symbol = "±",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Operation(CalculatorOperation.Percentage))
                }
            )
            CalculatorButton(
                symbol = "0",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Number(0))
                }
            )
            CalculatorButton(
                symbol = ".",
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Decimal)
                }
            )
            CalculatorButton(
                symbol = "=",
                textColor = operationColor,
                modifier = Modifier.weight(1f),
                onClick = {
                    onAction(CalculatorAction.Calculate)
                }
            )
        }
    }
}
