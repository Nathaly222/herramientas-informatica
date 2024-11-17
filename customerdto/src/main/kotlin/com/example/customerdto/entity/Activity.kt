package com.example.customerdto.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "activity")
class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @ManyToOne
    @JoinColumn(name = "lead_id", referencedColumnName = "id", nullable = false)  // Asegúrate de que lead_id no sea nulo
    var lead: Lead? = null

    @Column(name = "activity_type", nullable = false)  // Si activityType es obligatorio
    var activityType: String? = null

    @Column(name = "activity_date", nullable = false)  // Si activityDate es obligatorio
    var activityDate: LocalDateTime? = null

    @Column(name = "description")  // description es opcional
    var description: String? = null

    @Column(name = "responsible")  // responsible es opcional
    var responsible: String? = null

    @Column(name = "created_at", updatable = false, nullable = false)  // Asegúrate de que createdAt no se pueda actualizar
    var createdAt: LocalDateTime = LocalDateTime.now()

    // Se pueden agregar más métodos según sea necesario
}
