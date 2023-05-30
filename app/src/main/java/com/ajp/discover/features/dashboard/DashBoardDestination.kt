package com.ajp.discover.features.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.ajp.discover.features.dashboard.viewmodel.DashboardViewModel
import com.ajp.discover.ui.components.CircularProgress

/**
 * This screen compose component corresponds to many components
 */

@Composable
fun DashboardDestination(viewModel: DashboardViewModel) {
    val dashBoardState = viewModel.dashBoardState.collectAsState()

    LaunchedEffect(key1 = Unit,
        block = {
            // Launches this as soon as the screen is composed for the first time
// to handle any effects here
            // states are for UI states
            // You can choose to display toast on top of the screen without changing the
            // entire compose screen much
        })

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)
    ) {
        when (dashBoardState.value) {
            DashBoardState.UnInitialized -> {
                Surface(modifier = Modifier.fillMaxSize()) {

                    CircularProgress(percentProgress = 45f)
                }
            }
        }
    }
}


@Composable
fun DashBoardToolBar() {

}

@Composable
fun SearchBar() {

}

@Composable
fun UsageComponent() {

}

@Composable
fun FavoritesSection() {

}

@Composable
fun RecentSection() {

}