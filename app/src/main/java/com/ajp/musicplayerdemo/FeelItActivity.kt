package com.ajp.musicplayerdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ajp.musicplayerdemo.ui.navigation.MainScreen
import com.ajp.musicplayerdemo.ui.theme.FeelItTheme

class FeelItActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeelItTheme {
                MainScreen()
            }
        }
    }

}