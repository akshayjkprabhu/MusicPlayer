package com.ajp.musicplayerdemo.poc.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(text: MutableState<String>, click: (text: String) -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {

        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(value = text.value, onValueChange = {
                text.value = it
            })
            Button(onClick = { click(text.value) }) {
                Text(text = "Write Something")
            }
        }
    }
}