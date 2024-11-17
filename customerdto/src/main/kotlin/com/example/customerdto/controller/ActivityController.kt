package com.example.customerdto.controller

import com.example.customerdto.dto.ActivityDto
import com.example.customerdto.service.ActivityService
import com.example.customerdto.util.JSendResponse
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/activities")
class ActivityController(private val activityService: ActivityService) {

    // Obtener todas las actividades
    @GetMapping
    fun getAllActivities(): ResponseEntity<JSendResponse<List<ActivityDto>>> {
        val activities = activityService.getAllActivities()
        return ResponseEntity.ok(JSendResponse.success(activities))
    }

    @GetMapping("/{id}")
    fun getActivityById(@PathVariable id: Long): ResponseEntity<JSendResponse<ActivityDto>> {
        val activityDto = activityService.getActivityById(id)
        return ResponseEntity.ok(JSendResponse.success(activityDto))
    }

    @PostMapping
    fun createActivity(@RequestBody @Valid activityDto: ActivityDto): ResponseEntity<JSendResponse<ActivityDto>> {
        val createdActivity = activityService.createActivity(activityDto)
        return ResponseEntity.status(201).body(JSendResponse.success(createdActivity))
    }

    @GetMapping("/leads/{leadId}")
    fun getActivitiesByLead(@PathVariable leadId: Long): ResponseEntity<JSendResponse<List<ActivityDto>>> {
        val activities = activityService.getActivitiesByLead(leadId)
        return ResponseEntity.ok(JSendResponse.success(activities))
    }
}
