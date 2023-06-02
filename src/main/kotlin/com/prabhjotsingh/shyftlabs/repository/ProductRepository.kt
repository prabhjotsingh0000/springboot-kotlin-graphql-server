package com.prabhjotsingh.shyftlabs.repository

import com.prabhjotsingh.shyftlabs.data.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product?, String?>