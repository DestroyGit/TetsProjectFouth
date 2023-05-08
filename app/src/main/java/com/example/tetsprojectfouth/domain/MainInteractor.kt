package com.example.tetsprojectfouth.domain

class MainInteractor(val repository: MainRepository) {
    fun saveText(text: String) {
        repository.save(text)
    }

    fun loadData(data: (String) -> Unit) {
        repository.load(data)
    }
}