package com.pemmob.jovitafashya.data.model

data class Product(
    val id: Int,
    val category_id: Int,
    val name: String,
    val description: String?,
    val price: Double,
    val stock: Int,
    val img: String,
    val category: Category? = null
)
