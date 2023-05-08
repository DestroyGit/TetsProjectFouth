package com.example.tetsprojectfouth.data

import com.example.tetsprojectfouth.domain.MainRepository

 class MainRepositoryImpl(val storage: MainStorage) : MainRepository {
     override fun save(text: String) {
         storage.saveText(text)
     }

     override fun load(data: (String)-> Unit) {
         val x = storage.getStorageText()
         data.invoke(x)
     }
 }