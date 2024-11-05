package com.example.ecoTecRecicla.dto

import jakarta.persistence.Column
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class UserDto {

    @NotNull(message = "first name is required")
    @NotBlank(message = "first name is required")
    @Column(name = "first_name")
    var firstName: String? = null

    @NotNull(message = "last name is required")
    @NotBlank(message = "last name is required")
    @Column(name = "last_name")
    var lastName: String? = null

    @NotNull(message = "email is required")
    @NotBlank(message = "email is required")
    var email: String? = null

    @NotNull(message = "phone is required")
    @NotBlank(message = "phone is required")
    var phone: String? = null

    @NotNull(message = "address is required")
    @NotBlank(message = "address is required")
    var address: String? = null

    @NotNull(message = "recycling points is required")
    @Column(name = "recycling_points")
    var recyclingPoints: Long? = null
}