package com.example.customerdto.entity

import jakarta.persistence.*
import java.time.LocalDateTime


@Entity
@Table(name = "lead")
class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "full_name")
    var fullName: String? = null

    @Column(nullable = false, unique = true)
    var email: String? = null

    var phone: String? = null
    var source: String? = null
    var status: String? = null

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now()

    @OneToMany(mappedBy = "lead", cascade = [CascadeType.ALL], orphanRemoval = true)
    var activities: MutableList<Activity> = mutableListOf()
}

