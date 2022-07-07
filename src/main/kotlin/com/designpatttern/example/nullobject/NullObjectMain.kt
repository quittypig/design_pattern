package com.designpatttern.example.nullobject

import com.designpatttern.example.nullobject.customer.BasicCustomer
import com.designpatttern.example.nullobject.customer.CustomerFactory
import com.designpatttern.example.nullobject.customer.EmptyCustomer
import com.designpatttern.example.nullobject.customer.VipCustomer
import com.designpatttern.example.nullobject.game.EmptyGame
import com.designpatttern.example.nullobject.game.GameFactory
import com.designpatttern.example.nullobject.game.LeagueOfLegend
import com.designpatttern.example.nullobject.type.CustomerType

fun main() {
    val customerFactory = CustomerFactory(BasicCustomer(), VipCustomer(), EmptyCustomer())

    customerFactory.enter(CustomerType.BASIC)
    customerFactory.enter(CustomerType.VIP)
    customerFactory.enter(null)


    println("-----------------------------")

    val gameFactory = GameFactory()

    gameFactory.searchGame("LOL")
        .run {
            val game = this as LeagueOfLegend
            println(this.gameId)
            println(this.name)
            println(this.level)
        }

    println()

    gameFactory.searchGame("????")
        .run {
            val game = this as EmptyGame
            println(this.gameId)
        }
}
