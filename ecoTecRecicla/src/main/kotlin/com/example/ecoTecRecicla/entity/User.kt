package com.example.ecoTecRecicla.entity

import com.fasterxml.jackson.annotation.JsonManagedReference
import jakarta.persistence.*

@Entity
@Table(name = "users")
class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @Column(name = "first_name")
    var firstName: String? = null

    @Column(name = "last_name")
    var lastName: String? = null

    var email: String? = null
    var phone: String? = null
    var address: String? = null

    @Column(name = "recycling_points")
    var recyclingPoints: Long? = null

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JsonManagedReference
    var reports: MutableList<Report> = mutableListOf()
}