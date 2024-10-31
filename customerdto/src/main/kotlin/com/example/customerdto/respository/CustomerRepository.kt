package com.example.customerdto.respository

import com.example.customerdto.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository:JpaRepository<Customer, Long> {
}