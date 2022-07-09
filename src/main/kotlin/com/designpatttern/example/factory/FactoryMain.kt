package com.designpatttern.example.factory

import com.designpatttern.example.factory.abstractfactory.ChildManFactory
import com.designpatttern.example.factory.abstractfactory.Human
import com.designpatttern.example.factory.abstractfactory.ManFactory
import com.designpatttern.example.factory.abstractfactory.WomanFactory
import com.designpatttern.example.factory.factorymethod.English
import com.designpatttern.example.factory.factorymethod.Korean
import com.designpatttern.example.factory.factorymethod.LanguageType
import com.designpatttern.example.factory.type.GenderType
import com.designpatttern.example.factory.type.LanguageFactory

fun main() {
    println("----------Factory Method Pattern----------")
    val languageFactory = LanguageFactory(Korean(), English())

    languageFactory.greeting(LanguageType.KOREAN)
    languageFactory.greeting(LanguageType.ENGLISH)

    println("----------Abstract Factory Pattern----------")
    val chulhyong = Human(32, GenderType.MAN)
    val nebula = Human(15, GenderType.MAN)
    val kosmos = Human(17, GenderType.WOMAN)

    sing(chulhyong)
    sing(nebula)
    sing(kosmos)
}

private fun sing(chulhyong: Human) {
    when (chulhyong.gender) {
        GenderType.WOMAN -> {
            WomanFactory().sing()
        }
        GenderType.MAN -> {
            if (chulhyong.age in 10..20) {
                ChildManFactory().breakVoice()
            } else {
                ManFactory().sing()
            }
        }
    }
}

