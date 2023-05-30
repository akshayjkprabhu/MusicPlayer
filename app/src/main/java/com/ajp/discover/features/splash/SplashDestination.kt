package com.ajp.discover.features.splash

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ajp.discover.ui.components.CircularProgress


@Composable
fun SplashDestination() {

    Surface(modifier = Modifier.fillMaxSize()) {
        CircularProgress(percentProgress = 100f)
    }

}