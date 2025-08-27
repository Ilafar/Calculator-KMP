package com.example.calculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.lightGray

@Composable
fun Expression(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "1 + 2",
            color = Color(lightGray),
            fontSize = 12.sp
        )
        Text(
            text = "3",
            fontSize = 40.sp
        )
    }
}