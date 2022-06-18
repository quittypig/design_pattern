package com.designpatttern.example.singleton

class Singleton private constructor() {
    companion object {
        private val instance = Singleton

        fun getInstance(): Companion {
            return instance
        }
    }
}
