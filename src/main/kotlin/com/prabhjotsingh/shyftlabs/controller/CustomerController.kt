package com.prabhjotsingh.shyftlabs.controller

import com.prabhjotsingh.shyftlabs.data.Customer
import com.prabhjotsingh.shyftlabs.data.CustomerInput
import com.prabhjotsingh.shyftlabs.repository.CustomerRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class CustomerController (val customerRepository: CustomerRepository) {
    @QueryMapping
    fun customers(): MutableList<Customer?> {
        return customerRepository.findAll()
    }

    @QueryMapping
    fun customerById(@Argument id: Long): Customer? {
        return customerRepository.findById(id).orElseThrow()
    }

    @QueryMapping
    fun customerByEmail(@Argument email: String?): Customer? {
        return customerRepository.findCustomerByEmail(email)
    }

    @MutationMapping
    fun addCustomer(@Argument(name = "input") customerInput: CustomerInput): Customer {
        return customerRepository.save(customerInput.customerEntity)
    }
}
