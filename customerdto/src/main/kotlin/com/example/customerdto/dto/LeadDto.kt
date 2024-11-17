package com.example.customerdto.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class LeadDto(
   @field:NotNull(message = "Full name is required")
   @field:NotBlank(message = "Full name is required")
   val fullName: String,

   @field:NotNull(message = "Email is required")
   @field:NotBlank(message = "Email is required")
   val email: String,

   val phone: String? = null,
   val source: String? = null,
   val status: String = "nuevo",

)
