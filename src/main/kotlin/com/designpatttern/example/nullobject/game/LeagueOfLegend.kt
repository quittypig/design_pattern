package com.designpatttern.example.nullobject.game

data class LeagueOfLegend(
    override val gameId: String,
    override val name: String,
    val level: Int
) : Game(gameId, name)
