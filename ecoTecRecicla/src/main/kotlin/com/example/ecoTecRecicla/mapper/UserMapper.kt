package com.example.ecoTecRecicla.mapper

import com.example.ecoTecRecicla.dto.UserDto
import com.example.ecoTecRecicla.dto.UserSimpleDto

import com.example.ecoTecRecicla.entity.User

object UserMapper {

    fun toEntity (userDto: UserDto): User {
        val user =  User()
        user.firstName = userDto.firstName
        user.lastName = userDto.lastName
        user.email = userDto.email
        user.phone = userDto.phone
        user.address = userDto.address
        user.recyclingPoints = userDto.recyclingPoints
        return user
    }

    fun toEntity(userSimpleDto: UserSimpleDto): User {
        val user = User()
        user.id = userSimpleDto.id
        user.firstName = userSimpleDto.firstName
        user.lastName = userSimpleDto.lastName
        return user
    }

}