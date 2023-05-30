package com.ajp.discover.features.dashboard


sealed class DashBoardState {
    object UnInitialized : DashBoardState()
}

sealed class DashBoardUserIntent

sealed class DashBoardEffect
