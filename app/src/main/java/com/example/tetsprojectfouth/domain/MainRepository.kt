package com.example.tetsprojectfouth.domain

 interface MainRepository{
     fun save(text: String)
     fun load(data:(String)-> Unit)
 }