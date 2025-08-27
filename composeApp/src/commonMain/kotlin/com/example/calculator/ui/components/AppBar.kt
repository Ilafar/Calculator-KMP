package com.example.calculator.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import calculator.composeapp.generated.resources.Res
import calculator.composeapp.generated.resources.ic_history
import calculator.composeapp.generated.resources.ic_theme
import org.jetbrains.compose.resources.painterResource

@Composable
fun AppBar(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .windowInsetsPadding(WindowInsets.safeDrawing),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Button(
            onClick = {}
        ){
            Icon(painterResource(Res.drawable.ic_history), contentDescription = null)
        }
        Text(
            text = "Calculator",
            color = MaterialTheme.colorScheme.onSecondary
        )
        Button(
            onClick = {}
        ){
            Icon(painterResource(Res.drawable.ic_theme), contentDescription = null)
        }
    }
}