package com.example.customerdto.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.time.LocalDateTime

data class ActivityDto(
    @field:NotNull(message = "Lead ID is required")
    val leadId: Long,

    @field:NotNull(message = "Activity type is required")
    @field:NotBlank(message = "Activity type is required")
    val activityType: String,

    @field:NotNull(message = "Activity date is required")
    val activityDate: LocalDateTime,

    val description: String? = null,
    val responsible: String? = null
)
