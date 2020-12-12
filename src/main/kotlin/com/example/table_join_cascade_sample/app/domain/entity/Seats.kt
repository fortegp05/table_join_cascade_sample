package com.example.table_join_cascade_sample.app.domain.entity

import javax.persistence.*

@Entity
data class Seats(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Int = 0,
        var seat: String = ""
)