package com.example.customerdto.controller

import com.example.customerdto.dto.CustomerDto
import com.example.customerdto.entity.Customer
import com.example.customerdto.service.CustomerService
import com.example.customerdto.util.JSendResponse
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/customer")
class CustomerController {

    @Autowired
    lateinit var customerService: CustomerService

    @GetMapping
    fun getCustomers(): ResponseEntity<JSendResponse<List<Customer>>>{
        val customer = customerService.getCustomers()
        return ResponseEntity.ok(JSendResponse.success(customer))
    }


    @PostMapping
    fun save (@RequestBody @Valid customerDto: CustomerDto):ResponseEntity<JSendResponse<Customer>> {
       val savedCustomer = customerService.save(customerDto)
        return ResponseEntity.status(2001).body(JSendResponse.success(savedCustomer))
    }
}