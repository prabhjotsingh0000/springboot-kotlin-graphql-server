package com.prabhjotsingh.shyftlabs.data

class CustomerInput {
    var firstName: String? = null
    var lastName: String? = null
    var email: String? = null
    var phoneNumber: String? = null
    var address: String? = null
    var city: String? = null
    var state: String? = null
    var zipCode: String? = null
    val customerEntity: Customer
        get() {
            val customer = Customer()
            customer.firstName = firstName
            customer.lastName = lastName
            customer.email = email
            customer.phoneNumber = phoneNumber
            customer.address = address
            customer.city = city
            customer.state = state
            customer.zipCode = zipCode
            return customer
        }
}
