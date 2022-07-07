package com.designpatttern.example.nullobject.customer

class BasicCustomer : Customer() {
    override fun enter() {
        println("Basic customer enter!")
    }
}
