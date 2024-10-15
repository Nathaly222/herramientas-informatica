package com.example.tarea.service

import com.example.tarea.model.Student
import com.example.tarea.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    lateinit var studentRepository: StudentRepository

    fun list(): List<Student>{
        return studentRepository.findAll()
    }

    fun save(student:Student):Student{
        return studentRepository.save(student)
    }

    fun findById(id: Long): Student? {
        return studentRepository.findById(id).orElse(null)
    }
}