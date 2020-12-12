package com.example.table_join_cascade_sample.app.controller

import com.example.table_join_cascade_sample.app.domain.repository.TeachersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TeachersController {

    @Autowired
    lateinit var teachersRepository: TeachersRepository

    @GetMapping("teachers")
    fun getTeachers(): String {
        return teachersRepository.findAll().toString()
    }
}