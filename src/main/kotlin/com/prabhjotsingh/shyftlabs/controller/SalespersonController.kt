package com.prabhjotsingh.shyftlabs.controller

import com.prabhjotsingh.shyftlabs.data.Salesperson
import com.prabhjotsingh.shyftlabs.repository.SalespersonRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class SalespersonController(private val salespersonRepository: SalespersonRepository) {
    @QueryMapping
    fun salespeople(): MutableList<Salesperson?> {
        return salespersonRepository.findAll()
    }

    @QueryMapping
    fun salespersonById(@Argument id: Long): Salesperson? {
        return salespersonRepository.findById(id).orElseThrow()
    }

    @QueryMapping
    fun salespersonByEmail(@Argument email: String?): Salesperson? {
        return salespersonRepository.findSalespersonByEmail(email)
    }
}
