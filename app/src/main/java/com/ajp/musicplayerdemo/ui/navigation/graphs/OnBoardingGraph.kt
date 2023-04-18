package com.ajp.musicplayerdemo.ui.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ajp.musicplayerdemo.ui.destinations.GuidedTourDestination
import com.ajp.musicplayerdemo.ui.destinations.SplashDestination
import com.ajp.musicplayerdemo.ui.navigation.GraphRoute
import com.ajp.musicplayerdemo.ui.navigation.NavigationCommand

@Composable
fun OnBoardingGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        route = GraphRoute.OnBoarding.route,
        startDestination = NavigationCommand.Splash.destination
    ) {
        composable(
            route = NavigationCommand.Splash.destination
        ) {
            SplashDestination()
        }

        composable(
            route = NavigationCommand.GuidedTour.destination
        ) {
            GuidedTourDestination()
        }
    }
}
