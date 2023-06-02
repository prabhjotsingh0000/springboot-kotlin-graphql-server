package com.prabhjotsingh.shyftlabs.repository

import com.prabhjotsingh.shyftlabs.data.OrderLine
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderLineRepository : JpaRepository<OrderLine?, Long?>
