package com.example.customerdto.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "activity_view")
class ActivityView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "activity_type", nullable = false)
    var activityType: String? = null

    @Column(name = "activity_date", nullable = false)
    var activityDate: LocalDateTime? = null

    @Column(name = "description")
    var description: String? = null

    @Column(name = "responsible")
    var responsible: String? = null

    @Column(name = "created_at", updatable = false, nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.now()

    @Column(name = "full_name")
    var fullName: String? = null
}