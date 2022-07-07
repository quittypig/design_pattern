package com.designpatttern.example.nullobject.customer

class EmptyCustomer : Customer() {
    override fun enter() {
        println("There is no customer.")
    }
}
