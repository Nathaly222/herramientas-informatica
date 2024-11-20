package com.example.customerdto.respository

import com.example.customerdto.entity.ActivityView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ActivityViewRepository : JpaRepository<ActivityView, Long> {

}