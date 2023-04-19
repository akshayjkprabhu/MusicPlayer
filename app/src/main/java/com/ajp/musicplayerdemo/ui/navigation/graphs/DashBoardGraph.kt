package com.ajp.musicplayerdemo.ui.navigation.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ajp.musicplayerdemo.ui.navigation.GraphRoute
import com.ajp.musicplayerdemo.ui.navigation.NavigationCommand

fun NavGraphBuilder.dashBoardGraph(paddingValues: PaddingValues = PaddingValues()) {

    navigation(
        startDestination = NavigationCommand.Dashboard.destination,
        route = GraphRoute.DashBoard.route
    ) {
        composable(NavigationCommand.Dashboard.destination) {
            // Add a dashboard screen here
        }
    }
}