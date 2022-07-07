package com.designpatttern.example.nullobject.customer

class VipCustomer : Customer() {
    override fun enter() {
        println("VIP customer enter!")
    }
}
