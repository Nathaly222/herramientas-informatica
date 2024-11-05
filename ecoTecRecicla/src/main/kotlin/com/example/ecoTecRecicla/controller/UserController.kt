package com.example.ecoTecRecicla.controller

import com.example.ecoTecRecicla.dto.UserDto
import com.example.ecoTecRecicla.entity.User
import com.example.ecoTecRecicla.service.UserService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping
    fun getUsers()= userService.getUsers()

    @PostMapping
    fun save (@RequestBody @Valid userDto: UserDto):User {
        return userService.save(userDto)
    }
}