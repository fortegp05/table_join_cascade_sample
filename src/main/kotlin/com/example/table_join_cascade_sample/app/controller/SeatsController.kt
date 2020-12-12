package com.example.table_join_cascade_sample.app.controller

import com.example.table_join_cascade_sample.app.domain.repository.SeatsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SeatsController {
    @Autowired
    lateinit var seatsRepository: SeatsRepository

    @GetMapping("seats")
    fun getSeats(): String {
        return seatsRepository.findAll().toString()
    }
}