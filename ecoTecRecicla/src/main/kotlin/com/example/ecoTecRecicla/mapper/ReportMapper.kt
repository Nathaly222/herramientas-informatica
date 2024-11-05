package com.example.ecoTecRecicla.mapper

import com.example.ecoTecRecicla.dto.ReportDto
import com.example.ecoTecRecicla.dto.UserSimpleDto
import com.example.ecoTecRecicla.entity.Report
import com.example.ecoTecRecicla.entity.User

object ReportMapper {

    fun toEntity(reportDto: ReportDto, user: User?): Report {
        val report = Report()
        report.deviceType = reportDto.deviceType
        report.status = reportDto.status
        report.reportDate = reportDto.reportDate
        report.reportStatus = reportDto.reportStatus
        report.user = user
        return report
    }

    fun toDto(report: Report): ReportDto {
        return ReportDto().apply {
            deviceType = report.deviceType
            status = report.status
            reportDate = report.reportDate
            reportStatus = report.reportStatus
            user = UserSimpleDto().apply {
                id = report.user?.id
                firstName = report.user?.firstName
                lastName = report.user?.lastName
            }
        }
    }
}
