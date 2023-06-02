package com.prabhjotsingh.shyftlabs.data

import javax.persistence.*

@Entity
@Table(name = "ORDERS")
class Order {
    @Id
    @Column(name = "ORDER_ID")
    var id: String? = null

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false, updatable = false)
    var customer: Customer? = null

    @ManyToOne
    @JoinColumn(name = "SALESPERSON_ID", nullable = false, updatable = false)
    var salesperson: Salesperson? = null

    @OneToMany(mappedBy = "order")
    var orderLines: List<OrderLine>? = null
}