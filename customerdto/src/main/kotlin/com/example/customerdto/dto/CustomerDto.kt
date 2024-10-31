package com.example.customerdto.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class CustomerDto {

    @NotNull(message = "Full name is required")
    @NotBlank(message = "Full name is required")
    var lastname: String? = null

    @NotNull(message = "Email is required")
    @NotBlank(message = "Email is required")
    var email: String? = null
}
