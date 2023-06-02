package com.prabhjotsingh.shyftlabs.repository

import com.prabhjotsingh.shyftlabs.data.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository : JpaRepository<Order?, String?>