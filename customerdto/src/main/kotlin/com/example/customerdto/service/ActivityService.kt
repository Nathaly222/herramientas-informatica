package com.example.customerdto.service

import com.example.customerdto.dto.ActivityDto
import com.example.customerdto.mapper.ActivityMapper
import com.example.customerdto.respository.ActivityRepository
import com.example.customerdto.respository.LeadRepository
import org.springframework.stereotype.Service

@Service
class ActivityService(
    private val activityRepository: ActivityRepository,
    private val leadRepository: LeadRepository
) {

    fun getAllActivities(): List<ActivityDto> {
        val activities = activityRepository.findAll()
        return activities.map { ActivityMapper.toDto(it) }
    }

    fun getActivityById(id: Long): ActivityDto {
        val activity = activityRepository.findById(id).orElseThrow {
            RuntimeException("Activity not found")
        }
        return ActivityMapper.toDto(activity)
    }

    fun createActivity(activityDto: ActivityDto): ActivityDto {
        val lead = leadRepository.findById(activityDto.leadId).orElseThrow {
            RuntimeException("Lead with ID ${activityDto.leadId} not found")
        }
        val activity = ActivityMapper.toEntity(activityDto, lead)
        val savedActivity = activityRepository.save(activity)
        return ActivityMapper.toDto(savedActivity)
    }

    fun getActivitiesByLead(leadId: Long): List<ActivityDto> {
        leadRepository.findById(leadId).orElseThrow {
            RuntimeException("Lead with ID $leadId not found")
        }
        return activityRepository.findByLeadId(leadId).map { ActivityMapper.toDto(it) }
    }
}
