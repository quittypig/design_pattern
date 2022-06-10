package com.designpatttern.example.factory.type

import com.designpatttern.example.factory.English
import com.designpatttern.example.factory.Korean
import com.designpatttern.example.factory.LanguageType

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
