package com.designpatttern.example.factory.type

import com.designpatttern.example.factory.factorymethod.English
import com.designpatttern.example.factory.factorymethod.Korean
import com.designpatttern.example.factory.factorymethod.LanguageType

internal class LanguageFactory(
    private val korean: Korean,
    private val english: English
) {
    fun greeting(languageType: LanguageType) {
        when(languageType) {
            LanguageType.KOREAN -> korean.greeting()
            LanguageType.ENGLISH -> english.greeting()
        }
    }
}
