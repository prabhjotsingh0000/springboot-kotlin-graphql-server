package com.prabhjotsingh.shyftlabs.data

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "PRODUCTS")
class Product {
    @Id
    @Column(name = "PRODUCT_ID")
    var id: String? = null

    @Column(name = "NAME")
    var name: String? = null

    @Column(name = "SIZE")
    var size = 0

    @Column(name = "VARIETY")
    var variety: String? = null

    @Column(name = "PRICE")
    var price: BigDecimal? = null

    @Column(name = "STATUS")
    var status: String? = null
}