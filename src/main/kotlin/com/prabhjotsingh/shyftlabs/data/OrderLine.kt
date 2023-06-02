package com.prabhjotsingh.shyftlabs.data

import javax.persistence.*

@Entity
@Table(name = "ORDER_LINES")
class OrderLine {
    @Id
    @Column(name = "ORDER_LINE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @JoinColumn(name = "ORDER_ID", nullable = false, updatable = false)
    @ManyToOne
    var order: Order? = null

    @OneToOne
    @JoinColumn(name = "PRODUCT_ID", nullable = false, updatable = false)
    var product: Product? = null

    @Column(name = "QUANTITY")
    var quantity = 0
}
