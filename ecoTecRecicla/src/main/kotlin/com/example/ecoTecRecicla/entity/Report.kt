package com.example.ecoTecRecicla.entity

import com.fasterxml.jackson.annotation.JsonBackReference
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.time.LocalDate

@Entity
@Table(name = "reports")
class Report {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "device_type")
    var deviceType: String? = null

    var status: String? = null

    @Column(name = "report_date")
    var reportDate: LocalDate? = null

    @Column(name = "report_status")
    var reportStatus: String? = null

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    var user: User? = null
}