package com.ajp.musicplayerdemo.ui.navigation.graphs

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.ajp.musicplayerdemo.ui.navigation.GraphRoute
import kotlinx.coroutines.withContext


@Composable
fun LandingGraph(navHostController: NavHostController = rememberNavController()) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    // TODO have one effect passed from outside which can be handled here
    var updateDrawerState by remember {
        mutableStateOf(true)
    }

    LaunchedEffect(key1 = updateDrawerState) {
        withContext(scope.coroutineContext) {
            val drawerState = scaffoldState.drawerState
            if (drawerState.isOpen) {
                drawerState.close()
            } else {
                drawerState.open()
            }
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { bottomNavigation() },
        topBar = {
            landingScreenToolBar {
                updateDrawerState = updateDrawerState.not()
            }
        },
        drawerContent = { appDrawer() },
        scaffoldState = scaffoldState
    ) {
        NavHost(
            navController = navHostController,
            route = GraphRoute.Landing.route,
            startDestination = GraphRoute.DashBoard.route
        ) {
            dashBoardGraph(it)
            profileGraph(it)
        }
    }
}

@Composable
fun ColumnScope.appDrawer() {
    TextButton(onClick = { /*TODO*/ }) {

    }
}

@Composable
private fun landingScreenToolBar(toggleDrawer: () -> Unit) {
    TopAppBar(modifier = Modifier.fillMaxWidth()) {

        IconButton(onClick = toggleDrawer) {
            Icon(Icons.Default.Menu, contentDescription = null)
        }

        Text(
            text = "Feel It",
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.Center
        )

        IconButton(onClick = { }) {
            Icon(Icons.Default.Search, contentDescription = null)

        }

    }
}

@Composable
private fun bottomNavigation() {
    BottomAppBar(Modifier.fillMaxWidth()) {
        IconButton(onClick = { }, Modifier.weight(1f)) {
            Icon(Icons.Default.Home, contentDescription = null)
        }
        IconButton(onClick = { }, Modifier.weight(1f)) {
            Icon(Icons.Default.Search, contentDescription = null)
        }
        IconButton(onClick = { }, Modifier.weight(1f)) {
            Icon(Icons.Default.Settings, contentDescription = null)
        }
    }
}