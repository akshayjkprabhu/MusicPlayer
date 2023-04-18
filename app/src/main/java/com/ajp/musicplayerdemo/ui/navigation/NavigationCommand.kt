package com.ajp.musicplayerdemo.ui.navigation

/**
 * Represents Nav Graph routes
 */
sealed class GraphRoute(val route: String) {

    object Root : GraphRoute("RootGraph")

        object Landing : GraphRoute("LandingGraph")

            object DashBoard : GraphRoute("HomeGraph")

            object Search : GraphRoute("SearchGraph")

            object Profile : GraphRoute("Profile")

        object OnBoarding : GraphRoute("OnBoardingGraph")
}

/**
 * Represents Each screen routes
 */
sealed class NavigationCommand(
    // route represents each destinations
    var destination: String
) {
    object Splash : NavigationCommand("SplashDestination")
    object GuidedTour : NavigationCommand("GuidedTourDestination")

    object Dashboard : NavigationCommand("DashBoardDestination")


    object Profile : NavigationCommand(destination = "ProfileLanding")
    object Preferences : NavigationCommand("PreferenceDestination")

    object Search : NavigationCommand("SearchDestination")

    object Articles : NavigationCommand("SongDestination")
}