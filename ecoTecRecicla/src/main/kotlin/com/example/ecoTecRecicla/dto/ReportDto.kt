package com.example.ecoTecRecicla.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import java.time.LocalDate

class ReportDto {

    @NotNull(message = "device type is required")
    @NotBlank(message = "device type is required")
    var deviceType: String? = null

    @NotNull(message = "status is required")
    @NotBlank(message = "status is required")
    var status: String? = null

    @NotNull(message = "report date is required")
    var reportDate: LocalDate? = null

    @NotNull(message = "report status is required")
    @NotBlank(message = "report status is required")
    var reportStatus: String? = null

    @NotNull(message = "User ID is required")
    var user: UserSimpleDto? = null
}

