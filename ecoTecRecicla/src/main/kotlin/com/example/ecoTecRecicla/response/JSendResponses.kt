package com.example.ecoTecRecicla.response

data class JSendResponse<T>(
    val status: String,
    val data: T? = null,
    val message: String? = null,
    val code: Int? = null
) {
    companion object {
        fun <T> success(data: T, message: String?= null): JSendResponse<T> {
            return JSendResponse(status = "success", data = data, message = message)
        }

        fun <T> fail(message: String): JSendResponse<T> {
            return JSendResponse(status = "fail", message = message)
        }

        fun <T> error(message: String, code: Int): JSendResponse<T> {
            return JSendResponse(status = "error", message = message, code = code)
        }
    }
}
