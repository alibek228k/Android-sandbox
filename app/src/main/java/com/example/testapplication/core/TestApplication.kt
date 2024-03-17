package com.example.testapplication.core

import android.app.Application
import com.example.testapplication.di.appModule
import org.koin.core.context.startKoin

class TestApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(appModule)
        }
    }
}