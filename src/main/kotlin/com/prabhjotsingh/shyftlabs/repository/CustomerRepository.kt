package com.prabhjotsingh.shyftlabs.repository

import com.prabhjotsingh.shyftlabs.data.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<Customer?, Long?> {
    fun findCustomerByEmail(email: String?): Customer?
}
