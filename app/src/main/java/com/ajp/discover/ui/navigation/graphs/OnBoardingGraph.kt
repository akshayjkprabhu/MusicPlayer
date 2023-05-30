package com.ajp.discover.ui.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ajp.discover.features.onboarding.GuidedTourDestination
import com.ajp.discover.features.splash.SplashDestination
import com.ajp.discover.ui.components.CircularProgress
import com.ajp.discover.ui.navigation.GraphRoute
import com.ajp.discover.ui.navigation.NavigationCommand

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
