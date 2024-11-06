package com.example.ecoTecRecicla.controller


import com.example.ecoTecRecicla.dto.ReportDto
import com.example.ecoTecRecicla.response.JSendResponse
import com.example.ecoTecRecicla.service.ReportService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/reports")
class ReportController {

    @Autowired
    lateinit var reportService: ReportService

    @GetMapping
    fun getReports(): JSendResponse<List<ReportDto>>{
        val reports = reportService.getReports()
        return JSendResponse.success(reports, message = "Reportes obtenidos con éxito")
    }


    @PostMapping
    fun save (@RequestBody @Valid reportDto: ReportDto): JSendResponse<ReportDto> {
        val reports = reportService.save(reportDto)
        return JSendResponse.success(reports, message = "Reporte guardado exitosamente")

    }
}