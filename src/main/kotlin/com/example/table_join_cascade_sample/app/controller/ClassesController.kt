package com.example.table_join_cascade_sample.app.controller

import com.example.table_join_cascade_sample.app.domain.entity.Classes
import com.example.table_join_cascade_sample.app.domain.entity.Seats
import com.example.table_join_cascade_sample.app.domain.entity.Students
import com.example.table_join_cascade_sample.app.domain.repository.ClassesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClassesController {

    @Autowired
    lateinit var classesRepository: ClassesRepository

    @GetMapping("classes")
    fun getClasses(): String {
        return classesRepository.findAll().toString()
    }

    @GetMapping("classes/delete")
    fun deleteClasses(): String {
        classesRepository.deleteById(2)
        return classesRepository.findAll().toString()
    }

    @GetMapping("classes/insert")
    fun insertClasses(): String {
        val newClass = Classes(name = "かわ", students = null)
        classesRepository.save(newClass)
        return classesRepository.findAll().toString()
    }

    @GetMapping("classes/insert_with_student")
    fun insertClassesWithStudent(): String {
        val newClass = Classes(name = "かわ", students = null)
        val newSeat = Seats(seat = "席1")
        val newStudent = Students(name = "七郎", seats = newSeat, classes = newClass, teachers = null)
        newClass.students = listOf(newStudent)
        classesRepository.save(newClass)
        return classesRepository.findAll().toString()
    }
}