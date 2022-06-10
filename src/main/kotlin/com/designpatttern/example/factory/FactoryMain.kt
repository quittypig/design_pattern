package com.designpatttern.example.factory

import com.designpatttern.example.factory.type.LanguageFactory

fun main() {
    val languageFactory = LanguageFactory(Korean(), English())

    languageFactory.greeting(LanguageType.KOREAN)
    languageFactory.greeting(LanguageType.ENGLISH)
}
