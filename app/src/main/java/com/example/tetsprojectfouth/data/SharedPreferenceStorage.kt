package com.example.tetsprojectfouth.data

import android.content.Context
import android.content.SharedPreferences

class SharedPreferenceStorage( private val sharedPreferences: SharedPreferences) : MainStorage {
    companion object {

        const val TEXT_SHARED = "text_shared"
    }


    override fun saveText(text: String) {
        sharedPreferences.edit().putString(TEXT_SHARED, text).apply()
    }

    override fun getStorageText(): String {
        return sharedPreferences.getString(TEXT_SHARED, "hello world")?: "hello world"
    }
}