package com.prabhjotsingh.shyftlabs.data

import javax.persistence.*

@Entity
@Table(name = "CUSTOMERS")
class Customer {
    @Id
    @Column(name = "CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Column(name = "FIRST_NAME")
    var firstName: String? = null

    @Column(name = "LAST_NAME")
    var lastName: String? = null

    @Column(name = "EMAIL")
    var email: String? = null

    @Column(name = "PHONE")
    var phoneNumber: String? = null

    @Column(name = "ADDRESS")
    var address: String? = null

    @Column(name = "CITY")
    var city: String? = null

    @Column(name = "STATE")
    var state: String? = null

    @Column(name = "ZIPCODE")
    var zipCode: String? = null
}
