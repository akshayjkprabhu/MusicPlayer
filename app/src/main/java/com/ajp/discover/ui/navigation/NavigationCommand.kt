package com.ajp.discover.ui.navigation

/**
 * Represents Nav Graph routes
 *
 * https://www.figma.com/file/xaxHED4LOkEVNbfrRPJ1Ae/File-Manager-(Community)?node-id=0-1&t=Rk2jUO3RrVkDLTVh-0
 */
sealed class GraphRoute(val route: String) {

    object Root : GraphRoute("RootGraph")

    object Landing : GraphRoute("LandingGraph")

    object DashBoard : GraphRoute("HomeGraph")

    object Search : GraphRoute("FilesGraph")

    object Profile : GraphRoute("CloudGraph")

    object Clean : GraphRoute("CleanGraph")

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