package com.example.ecoTecRecicla.repository

import com.example.ecoTecRecicla.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository:JpaRepository<User, Long>{
}