package com.example.ecoTecRecicla.repository

import com.example.ecoTecRecicla.entity.Report
import org.springframework.data.jpa.repository.JpaRepository

interface ReportRepository: JpaRepository<Report, Long>{

}