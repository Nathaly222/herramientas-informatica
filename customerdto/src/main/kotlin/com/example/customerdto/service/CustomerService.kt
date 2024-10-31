package com.example.customerdto.service

import com.example.customerdto.dto.CustomerDto
import com.example.customerdto.entity.Customer
import com.example.customerdto.mapper.CustomerMapper
import com.example.customerdto.respository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    lateinit var customerRepository: CustomerRepository

    fun getCustomers() : List<Customer>{
        return customerRepository.findAll()
    }

    fun save(customerDto: CustomerDto): Customer {
        val customer = CustomerMapper.toEntity(customerDto)
        return customerRepository.save(customer)
    }
}