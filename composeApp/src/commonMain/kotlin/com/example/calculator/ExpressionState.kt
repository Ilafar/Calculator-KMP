package com.example.calculator

data class ExpressionState(
    val firstNumber: String = "",
    val secondNumber: String = "",
    val operation: CalculatorOperation? = null
)
