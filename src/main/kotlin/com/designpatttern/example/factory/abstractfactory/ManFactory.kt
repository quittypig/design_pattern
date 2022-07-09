package com.designpatttern.example.factory.abstractfactory

open class ManFactory: HumanFactory {
    override fun sing() {
        println("Man sing!")
    }
}
