package com.example.table_join_cascade_sample.app.controller

import com.example.table_join_cascade_sample.app.domain.entity.Classes
import com.example.table_join_cascade_sample.app.domain.entity.Seats
import com.example.table_join_cascade_sample.app.domain.entity.Students
import com.example.table_join_cascade_sample.app.domain.entity.Teachers
import com.example.table_join_cascade_sample.app.domain.repository.ClassesRepository
import com.example.table_join_cascade_sample.app.domain.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController {

    @Autowired
    lateinit var studentRepository: StudentRepository

    @Autowired
    lateinit var classesRepository: ClassesRepository

    @GetMapping("students")
    fun getStudents(): String {
        return studentRepository.findAll().toString()
    }

    @GetMapping("students/delete")
    fun deleteStudents(): String {
        studentRepository.deleteById(1)
        return studentRepository.findAll().toString()
    }

    @GetMapping("students/insert")
    fun insertStudents(): String {
        val newSeat = Seats(seat = "席4")
        val skyClass = classesRepository.findById(1).get()
        val newStudent = Students(name = "四郎", seats = newSeat, classes = skyClass, teachers = null)
        studentRepository.save(newStudent)
        return studentRepository.findAll().toString()
    }

    @GetMapping("students/insert_with_class")
    fun insertStudentsWithClass(): String {
        val newSeat = Seats(seat = "席4")
        val newClass = Classes(name="まち", students = null)
        val newStudent = Students(name = "八郎", seats = newSeat, classes = newClass, teachers = null)
        newClass.students = listOf(newStudent)
        studentRepository.save(newStudent)
        return studentRepository.findAll().toString()
    }

    @GetMapping("students/insert_with_teacher")
    fun insertStudentsWithTeacher(): String {
        val newSeat = Seats(seat = "席5")
        val newClass = Classes(name="かわ", students = null)
        val newTeacher = Teachers(name = "栃木", students = null)
        val newStudent = Students(name = "九郎", seats = newSeat, classes = newClass, teachers = listOf(newTeacher))
        newClass.students = listOf(newStudent)
        studentRepository.save(newStudent)
        return studentRepository.findAll().toString()
    }
}