package com.designpatttern.example.singleton


object SingletonObj {
    val randNumber by lazy { (0..1000).random() }
}
