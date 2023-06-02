package com.prabhjotsingh.shyftlabs.controller

import com.prabhjotsingh.shyftlabs.data.Product
import com.prabhjotsingh.shyftlabs.repository.ProductRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class ProductController(private val productRepository: ProductRepository) {
    @QueryMapping
    fun products(): MutableList<Product?> {
        return productRepository.findAll()
    }

    @QueryMapping
    fun productById(@Argument id: String): Product? {
        return productRepository.findById(id).orElseThrow()
    }
}
