package com.ajp.discover.ui.navigation.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ajp.discover.features.dashboard.DashboardDestination
import com.ajp.discover.features.dashboard.viewmodel.DashboardViewModel
import com.ajp.discover.ui.components.CircularProgress
import com.ajp.discover.ui.navigation.GraphRoute
import com.ajp.discover.ui.navigation.NavigationCommand

fun NavGraphBuilder.dashBoardGraph(paddingValues: PaddingValues = PaddingValues()) {

    navigation(
        startDestination = NavigationCommand.Dashboard.destination,
        route = GraphRoute.DashBoard.route
    ) {
        composable(NavigationCommand.Dashboard.destination) {
            // Add a dashboard screen here
            DashboardDestination(viewModel = DashboardViewModel())
        }
    }
}