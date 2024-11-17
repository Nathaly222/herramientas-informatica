package com.example.customerdto.respository

import com.example.customerdto.entity.Lead
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LeadRepository : JpaRepository<Lead, Long> {
}