package com.prabhjotsingh.shyftlabs.repository

import com.prabhjotsingh.shyftlabs.data.Salesperson
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SalespersonRepository : JpaRepository<Salesperson?, Long?> {
    fun findSalespersonByEmail(email: String?): Salesperson?
}