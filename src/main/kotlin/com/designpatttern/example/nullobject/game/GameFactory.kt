package com.designpatttern.example.nullobject.game

class GameFactory {
    fun searchGame(gameId: String): EmptyGame {
        return when (gameId) {
            "LOL" -> LeagueOfLegend(gameId, "LeagueOfLegend", 1)
            else -> EmptyGame(gameId)
        }
    }
}
