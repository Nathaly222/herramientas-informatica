package com.example.customerdto.controller

import com.example.customerdto.dto.LeadDto
import com.example.customerdto.service.LeadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/leads")
class LeadController @Autowired constructor(
    private val leadService: LeadService
) {

    // Obtener todos los leads
    @GetMapping
    fun getAllLeads(): List<LeadDto> {
        return leadService.getAllLeads()
    }

    // Crear un nuevo lead
    @PostMapping
    fun createLead(@RequestBody leadDto: LeadDto): LeadDto {
        return leadService.createLead(leadDto)
    }

    // Obtener un lead por ID
    @GetMapping("/{id}")
    fun getLeadById(@PathVariable id: Long): LeadDto {
        return leadService.getLeadById(id)
    }

    // Cambiar el estado de un lead
    @PutMapping("/{id}/set-status")
    fun setStatus(@PathVariable id: Long, @RequestParam status: String): LeadDto {
        return leadService.setStatus(id, status)
    }
}
