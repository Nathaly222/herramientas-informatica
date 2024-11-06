package com.example.ecoTecRecicla.service

import com.example.ecoTecRecicla.dto.UserDto
import com.example.ecoTecRecicla.entity.User
import com.example.ecoTecRecicla.mapper.UserMapper
import com.example.ecoTecRecicla.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository


    fun getUsers(): List<User>{
        return userRepository.findAll()
    }

    fun findById(id: Long): User? {
        return userRepository.findById(id).orElse(null)  // Devuelve el usuario si existe, o null si no.
    }

    fun save(userDto: UserDto): User {
        val user = UserMapper.toEntity(userDto)
        return userRepository.save(user)
    }

}