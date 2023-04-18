package com.ajp.musicplayerdemo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ajp.musicplayerdemo.ui.navigation.graphs.LandingGraph
import com.ajp.musicplayerdemo.ui.navigation.graphs.OnBoardingGraph

/**
 * Develop independent screens.
 * You can rewrite the graph and path any time.
 *
 * Check if you can use single nav controller or multiple nav controller for nested graphs
 *
 * TODO Create a graphical representation of the screen hierarchy
 * IDEA :
 * Root graph - (graph of graphs)
 *  - OnBoarding - Splash & Tour destinations
 *  - Landing
 *      - Dashboard (nested graph) - contains multiple destinations
 *      - Profile - (nested graph) - contains multiple destinations
 *      - Library (need to decide)
 */
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        route = GraphRoute.Root.route,
        startDestination = GraphRoute.OnBoarding.route
    ) {

        composable(
            GraphRoute.OnBoarding.route
        ) {
            OnBoardingGraph()
        }

        composable(GraphRoute.DashBoard.route) {
            LandingGraph()
        }
    }
}

