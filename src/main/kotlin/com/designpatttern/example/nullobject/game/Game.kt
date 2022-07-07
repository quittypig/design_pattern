package com.designpatttern.example.nullobject.game

open class Game(
    override val gameId: String,
    open val name: String
) : EmptyGame(gameId)
