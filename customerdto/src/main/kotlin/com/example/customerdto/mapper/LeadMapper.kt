package com.example.customerdto.mapper

import com.example.customerdto.dto.LeadDto
import com.example.customerdto.entity.Lead

object LeadMapper {

    fun toEntity(leadDto: LeadDto): Lead {
        val lead = Lead()
        lead.fullName = leadDto.fullName
        lead.email = leadDto.email
        lead.phone = leadDto.phone
        lead.source = leadDto.source
        lead.status = leadDto.status
        return lead
    }

    fun toDto(lead: Lead): LeadDto {
        return LeadDto(
            fullName = lead.fullName ?: "",
            email = lead.email ?: "",
            phone = lead.phone,
            source = lead.source,
            status = lead.status ?: "nuevo"
        )
    }
}
