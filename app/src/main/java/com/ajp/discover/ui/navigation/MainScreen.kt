package com.ajp.discover.ui.navigation

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ajp.discover.BuildConfig
import com.ajp.discover.ui.navigation.graphs.LandingGraph
import com.ajp.discover.ui.navigation.graphs.OnBoardingGraph

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
    val context = LocalContext.current
    NavHost(
        navController = navController,
        route = GraphRoute.Root.route,
        startDestination = GraphRoute.DashBoard.route
    ) {

        composable(GraphRoute.OnBoarding.route) {
            OnBoardingGraph()
        }

        composable(GraphRoute.DashBoard.route) {
            LandingGraph()
        }
    }
}

fun redirectToAllFilePermissionScreen(context : Context) {

    val uri = Uri.parse("package:${BuildConfig.APPLICATION_ID}")

    context.startActivity(
        Intent(
            Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION,
            uri
        )
    )
}

