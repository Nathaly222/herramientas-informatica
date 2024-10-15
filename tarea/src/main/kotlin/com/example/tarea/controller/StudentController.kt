package com.example.tarea.controller

import com.example.tarea.model.Student
import com.example.tarea.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun list(): List<Student> {
        return studentService.list()
    }

    @PostMapping
    fun save(@RequestBody student:Student):Student{
        return studentService.save(student)
    }

    @GetMapping("/{id}")
    fun getStudentById(@PathVariable id: Long): Student {
        return studentService.findById(id) ?: throw RuntimeException("Estudiante no encontrado")
    }
    
}