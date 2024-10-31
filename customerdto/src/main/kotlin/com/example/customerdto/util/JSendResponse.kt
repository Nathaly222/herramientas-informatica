package com.example.customerdto.util

data class JSendResponse<T>(
    val status: String,
    val data: T? = null,
    val message: String? = null,
    val code: Int? = null
) {
    companion object {
        fun <T> success(data: T): JSendResponse<T> = JSendResponse(status = "success", data = data)

        fun <T> fail(message: String, data: T? = null): JSendResponse<T> =
            JSendResponse(status = "fail", message = message, data = data)

        fun error(message: String, code: Int): JSendResponse<Nothing> =
            JSendResponse(status = "error", message = message, code = code)
    }
}
