package com.ajp.musicplayerdemo.ui.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.ajp.musicplayerdemo.ui.navigation.GraphRoute
import com.ajp.musicplayerdemo.ui.navigation.NavigationCommand


@Composable
fun LandingGraph(navHostController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navHostController,
        route = GraphRoute.Landing.route,
        startDestination = GraphRoute.DashBoard.route
    ) {

        dashBoardGraph()
        profileGraph()
    }
}

fun NavGraphBuilder.profileGraph() {
    navigation(
        startDestination = NavigationCommand.Profile.destination,
        route = GraphRoute.Profile.route
    ) {
        // todo add screen sets coming under profile sections
        // such as favorites
        // saved
        // playlists
        // settings

        composable(route = NavigationCommand.Profile.destination) {

        }
    }

}

fun NavGraphBuilder.dashBoardGraph() {

    navigation(
        startDestination = NavigationCommand.Dashboard.destination,
        route = GraphRoute.DashBoard.route
    ) {
        composable(NavigationCommand.Dashboard.destination) {
            // Add a dashboard screen here
        }
    }
}