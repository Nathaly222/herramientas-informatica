package com.example.tarea.repository

import com.example.tarea.model.Student
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface StudentRepository : JpaRepository<Student, Long> {
    fun findByLastname(lastname: String): List<Student>
}