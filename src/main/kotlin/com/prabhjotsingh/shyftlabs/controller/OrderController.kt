package com.prabhjotsingh.shyftlabs.controller

import com.prabhjotsingh.shyftlabs.data.Order
import com.prabhjotsingh.shyftlabs.repository.OrderRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class OrderController(private val orderRepository: OrderRepository) {
    @QueryMapping
    fun orders(): MutableList<Order?> {
        return orderRepository.findAll()
    }

    @QueryMapping
    fun orderById(@Argument id: String): Order? {
        return orderRepository.findById(id).orElseThrow()
    }
}
