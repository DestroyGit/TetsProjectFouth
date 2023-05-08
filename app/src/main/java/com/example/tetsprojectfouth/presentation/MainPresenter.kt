package com.example.tetsprojectfouth.presentation

import android.content.Context
import android.widget.TextView
import com.example.tetsprojectfouth.domain.MainInteractor

class MainPresenter(
    val view: MainView,
    val mainInteractor: MainInteractor
) {
    init {
        mainInteractor.loadData { data ->
            view.getText(data)
        }
    }

    fun doAction(text: String) {

        val tempText = "$text${(1..44).random()}"
        view.getText(tempText)

        mainInteractor.saveText(tempText)
    }
}