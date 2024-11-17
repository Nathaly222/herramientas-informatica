package com.example.customerdto.service

import com.example.customerdto.dto.LeadDto
import com.example.customerdto.mapper.LeadMapper
import com.example.customerdto.respository.LeadRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LeadService @Autowired constructor(
    private val leadRepository: LeadRepository
) {

    // Obtener todos los leads
    fun getAllLeads(): List<LeadDto> {
        return leadRepository.findAll().map { LeadMapper.toDto(it) }
    }

    // Crear un nuevo lead
    fun createLead(leadDto: LeadDto): LeadDto {
        val lead = LeadMapper.toEntity(leadDto)
        val savedLead = leadRepository.save(lead)
        return LeadMapper.toDto(savedLead)
    }

    // Obtener un lead específico por su ID
    fun getLeadById(id: Long): LeadDto {
        val lead = leadRepository.findById(id).orElseThrow {
            RuntimeException("Lead with ID $id not found")
        }
        return LeadMapper.toDto(lead)
    }

    // Cambiar el estado de un lead
    fun setStatus(id: Long, status: String): LeadDto {
        val lead = leadRepository.findById(id).orElseThrow {
            RuntimeException("Lead with ID $id not found")
        }
        lead.status = status
        val updatedLead = leadRepository.save(lead)
        return LeadMapper.toDto(updatedLead)
    }
}
