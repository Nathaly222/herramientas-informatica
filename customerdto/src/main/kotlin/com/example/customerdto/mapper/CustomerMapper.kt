package com.example.customerdto.mapper

import com.example.customerdto.dto.CustomerDto
import com.example.customerdto.entity.Customer

object CustomerMapper {
    fun toEntity(customerDto: CustomerDto): Customer {
        val customer = Customer()
        customer.lastname = customerDto.lastname
        customer.email = customerDto.email
        return customer
    }
}
