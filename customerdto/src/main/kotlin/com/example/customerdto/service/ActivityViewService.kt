package com.example.customerdto.service

import com.example.customerdto.entity.ActivityView
import com.example.customerdto.respository.ActivityViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ActivityViewService {

    @Autowired
    lateinit var activityViewRepository: ActivityViewRepository

    fun getActivityView(): List<ActivityView> {
        return activityViewRepository.findAll()
    }
}