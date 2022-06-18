package com.designpatttern.example.singleton

fun main() {
    val singletonClassA = Singleton.getInstance()
    val singletonClassB = Singleton.getInstance()
    println(singletonClassA == singletonClassB)

    for (i in 1..10) {
        println("$i: ${SingletonObj.randNumber}")
    }
}
