package com.example.tetsprojectfouth.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.tetsprojectfouth.App
import com.example.tetsprojectfouth.R
import com.example.tetsprojectfouth.data.MainRepositoryImpl
import com.example.tetsprojectfouth.data.SharedPreferenceStorage
import com.example.tetsprojectfouth.domain.MainInteractor
import com.example.tetsprojectfouth.domain.MainRepository
import com.example.tetsprojectfouth.presentation.MainPresenter
import com.example.tetsprojectfouth.presentation.MainView

class MainActivity : AppCompatActivity(), MainView {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textViewTest)

        val interactor = MainInteractor(MainRepositoryImpl(App.instance.mainStorage))
        val presenter = MainPresenter(this, interactor)
        textView.setOnClickListener {
            presenter.doAction(textView.text.toString())
        }
    }

    override fun getText(newText: String) {
        textView.text = newText
    }


}