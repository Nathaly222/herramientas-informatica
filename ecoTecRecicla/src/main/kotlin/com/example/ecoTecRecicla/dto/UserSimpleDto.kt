package com.example.ecoTecRecicla.dto


class UserSimpleDto {

        @jakarta.validation.constraints.NotNull(message = "User ID is requiredd")
        var id: Long? = null

        var firstName: String? = null
        var lastName: String? = null
}
