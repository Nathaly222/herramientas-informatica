package com.example.customerdto.mapper

import com.example.customerdto.dto.ActivityDto
import com.example.customerdto.entity.Activity
import com.example.customerdto.entity.Lead
import java.time.LocalDateTime

object ActivityMapper {
    fun toEntity(activityDto: ActivityDto, lead: Lead): Activity {
        val activity = Activity()
        activity.lead = lead
        activity.activityType = activityDto.activityType
        activity.activityDate = activityDto.activityDate
        activity.description = activityDto.description
        activity.responsible = activityDto.responsible
        return activity
    }
    fun toDto(activity: Activity): ActivityDto {
        return  ActivityDto(
            leadId = activity.lead?.id ?: 0,
            activityType = activity.activityType ?: "",
            activityDate = activity.activityDate ?: LocalDateTime.now(),
            description = activity.description,
            responsible = activity.responsible
        )
    }
}