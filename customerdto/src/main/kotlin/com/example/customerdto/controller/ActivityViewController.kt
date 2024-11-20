package com.example.customerdto.controller

import com.example.customerdto.entity.ActivityView
import com.example.customerdto.service.ActivityViewService
import com.example.customerdto.util.JSendResponse
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/activityView")
class ActivityViewController {
    @Autowired
    lateinit var activityViewService: ActivityViewService

    @GetMapping
    fun getActivityView(): ResponseEntity<JSendResponse<List<ActivityView>>> {
        val activityView =activityViewService.getActivityView()
        return ResponseEntity.ok(JSendResponse.success(activityView))
    }
}