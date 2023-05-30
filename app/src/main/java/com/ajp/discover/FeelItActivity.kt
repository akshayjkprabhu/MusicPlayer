package com.ajp.discover

import android.app.Service
import android.content.Intent
import android.os.Bundle
import android.os.IBinder
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.ajp.discover.ui.navigation.MainScreen
import com.ajp.discover.ui.theme.FeelItTheme

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