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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.lightGray

@Composable
fun Expression(expression: String,result: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            maxLines = 2 ,
            overflow = TextOverflow.StartEllipsis,
            text = expression,
            color = Color(lightGray),
            fontSize = 21.sp
        )
        Text(
            maxLines = 1,
            overflow = TextOverflow.StartEllipsis,
            text = result,
            fontSize = 49.sp
        )
    }
}