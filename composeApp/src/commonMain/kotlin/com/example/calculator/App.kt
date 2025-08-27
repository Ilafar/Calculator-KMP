package com.example.calculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator.ui.components.AppBar
import com.example.calculator.ui.components.CalculatorPad
import com.example.calculator.ui.components.Expression
import com.example.calculator.ui.theme.CalculatorTheme

@Composable
fun App() {
    CalculatorTheme {
        Surface {
            val viewModel: CalculatorViewModel = viewModel { CalculatorViewModel() }
            val state = viewModel.state
            val expression = viewModel.expression
            val result = state.firstNumber + (state.operation?.symbol ?: "") + state.secondNumber
            Column(
                modifier = Modifier
                    .padding(12.dp)
            ) {
                AppBar()
                Expression(expression,result)
                CalculatorPad(state = state, onAction = viewModel::onAction)
            }
        }
    }
}