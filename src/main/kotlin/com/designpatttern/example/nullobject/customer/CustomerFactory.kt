package com.designpatttern.example.nullobject.customer

import com.designpatttern.example.nullobject.type.CustomerType

class CustomerFactory(
    private val basicCustomer: BasicCustomer,
    private val vipCustomer: VipCustomer,
    private val emptyCustomer: EmptyCustomer
) {
    fun enter(customerType: CustomerType?) {
        when (customerType) {
            CustomerType.BASIC -> basicCustomer.enter()
            CustomerType.VIP -> vipCustomer.enter()
            null -> emptyCustomer.enter()
        }
    }
}
