package com.ajp.discover.features.dashboard.viewmodel

import androidx.lifecycle.ViewModel
import com.ajp.discover.features.dashboard.DashBoardState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashboardViewModel : ViewModel() {

    private val _dashBoardState: MutableStateFlow<DashBoardState> =
        MutableStateFlow(DashBoardState.UnInitialized)
    val dashBoardState: StateFlow<DashBoardState>
        get() = _dashBoardState
}