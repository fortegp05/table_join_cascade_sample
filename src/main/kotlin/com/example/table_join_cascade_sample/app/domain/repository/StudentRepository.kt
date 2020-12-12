package com.example.table_join_cascade_sample.app.domain.repository

import com.example.table_join_cascade_sample.app.domain.entity.Students
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Students, Int>