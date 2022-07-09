package com.designpatttern.example.factory.abstractfactory

class WomanFactory: HumanFactory {
    override fun sing() {
        println("Woman sing!")
    }
}
