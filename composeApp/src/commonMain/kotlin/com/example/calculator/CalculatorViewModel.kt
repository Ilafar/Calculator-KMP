package com.example.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {
    var expression by mutableStateOf("")
    var state by mutableStateOf(ExpressionState())
        private set

    fun onAction(action: CalculatorAction) {
        when(action) {
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Clear -> state = ExpressionState()
            is CalculatorAction.Operation -> enterOperation(action.operation)
            is CalculatorAction.Calculate -> performCalculation()
            is CalculatorAction.Delete -> performDeletion()
        }

    }

    private fun performDeletion() {
        when {
            state.secondNumber.isNotBlank() -> state = state.copy(
                secondNumber = state.secondNumber.dropLast(1)
            )
            state.operation != null -> state = state.copy(
                operation = null
            )
            state.firstNumber.isNotBlank() -> state = state.copy(
                firstNumber = state.firstNumber.dropLast(1)
            )
        }
    }

    private fun performCalculation() {
        val firstNumber = state.firstNumber.toDoubleOrNull()
        val secondNumber = state.secondNumber.toDoubleOrNull()
        if(firstNumber != null && secondNumber != null) {
            val result = when(state.operation) {
                is CalculatorOperation.Add -> firstNumber + secondNumber
                is CalculatorOperation.Subtract -> firstNumber - secondNumber
                is CalculatorOperation.Multiply -> firstNumber * secondNumber
                is CalculatorOperation.Divide -> firstNumber / secondNumber
                is CalculatorOperation.Percentage -> firstNumber % secondNumber
                null -> return
            }
            expression = state.firstNumber + (state.operation?.symbol ?: "") + state.secondNumber
            state = state.copy(
                firstNumber = result.toString().take(10),
                secondNumber = "",
                operation = null
            )
        }
    }

    private fun enterOperation(operation: CalculatorOperation) {
        if(state.firstNumber.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }

    private fun enterDecimal() {
        if(state.operation == null && !state.firstNumber.contains(".")
            && state.firstNumber.isNotBlank()
        ) {
            state = state.copy(
                firstNumber = state.firstNumber + "."
            )
            return
        }
        if(!state.secondNumber.contains(".") && state.secondNumber.isNotBlank()
        ) {
            state = state.copy(
                secondNumber = state.secondNumber + "."
            )
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operation == null) {
            if(state.firstNumber.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(
                firstNumber = state.firstNumber + number
            )
            return
        }
        if(state.secondNumber.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(
            secondNumber = state.secondNumber + number
        )
    }

    companion object{
        const val MAX_NUM_LENGTH = 8
    }
}