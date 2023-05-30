package com.ajp.discover.ui.navigation.graphs

import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ajp.discover.ui.navigation.GraphRoute
import com.ajp.discover.ui.navigation.NavigationCommand


fun NavGraphBuilder.profileGraph(paddingValues: PaddingValues = PaddingValues()) {
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