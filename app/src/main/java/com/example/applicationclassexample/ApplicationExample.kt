package com.example.applicationclassexample

import android.app.Application
import android.os.Debug
import timber.log.Timber

class ApplicationExample: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}