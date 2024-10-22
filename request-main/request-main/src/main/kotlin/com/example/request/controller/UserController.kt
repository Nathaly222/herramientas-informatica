package com.example.request.controller

import com.example.request.model.JSendResponse
import com.example.request.model.User

import jakarta.websocket.server.PathParam
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
// import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/users")
class UserController {
  /*  @GetMapping("/{id}")
    fun user(@PathVariable("id") id: Int): String {
        return "user hello $id"
    }*/

   /* @GetMapping()
    fun user(@PathParam ("id") id: Int): String {
        return "user hello $id"
    }*/

    @GetMapping()
    fun user(@RequestBody user:User): ResponseEntity<JSendResponse<User>> {
        return ResponseEntity(
            JSendResponse(
                status = "success",
                data =user
            ),
            HttpStatus.OK
        )
    }

}




