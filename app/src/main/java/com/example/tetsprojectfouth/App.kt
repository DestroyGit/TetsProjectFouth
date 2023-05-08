package com.example.tetsprojectfouth

import android.app.Application
import com.example.tetsprojectfouth.data.MainStorage
import com.example.tetsprojectfouth.data.SharedPreferenceStorage

class App : Application() {

    companion object {
        lateinit var instance: App
        const val SHARED_PREFERECNES = "shared_prefere"
    }

    lateinit var mainStorage: MainStorage
    override fun onCreate() {
        super.onCreate()
        instance = this
        mainStorage = SharedPreferenceStorage(
            getSharedPreferences(SHARED_PREFERECNES, MODE_PRIVATE)
        )
    }
}