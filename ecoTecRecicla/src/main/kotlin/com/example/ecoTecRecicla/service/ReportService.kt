package com.example.ecoTecRecicla.service

import com.example.ecoTecRecicla.dto.ReportDto
import com.example.ecoTecRecicla.entity.Report
import com.example.ecoTecRecicla.entity.User
import com.example.ecoTecRecicla.mapper.ReportMapper
import com.example.ecoTecRecicla.repository.ReportRepository
import com.example.ecoTecRecicla.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ReportService {

    @Autowired
    lateinit var reportRepository: ReportRepository

    @Autowired
    lateinit var userRepository: UserRepository

    fun getReports(): List<ReportDto> {
        // Obtiene todos los reportes y los convierte a ReportDto
        val reports: List<Report> = reportRepository.findAll()
        return reports.map { report ->
            ReportMapper.toDto(report)
        }
    }

    fun save(reportDto: ReportDto): ReportDto {
        val userId = reportDto.user?.id
            ?: throw IllegalArgumentException("User ID is required in ReportDto")

        val user: User = userRepository.findById(userId)
            .orElseThrow { RuntimeException("User not found with id: $userId") }

        val report = ReportMapper.toEntity(reportDto, user)
        val savedReport = reportRepository.save(report)

        // Convierte el Report guardado en un ReportDto antes de devolverlo
        return ReportMapper.toDto(savedReport)
    }
}

