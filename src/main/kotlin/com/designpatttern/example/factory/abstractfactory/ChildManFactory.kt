package com.designpatttern.example.factory.abstractfactory

class ChildManFactory : ManFactory() {
    fun breakVoice() {
        println("Child breakVoice!")
    }
}
