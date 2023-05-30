package com.ajp.discover.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FeelItApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}