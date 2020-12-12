package com.example.table_join_cascade_sample.app.domain.entity

import javax.persistence.*

@Entity
data class Classes (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id : Int = 0,
        var name : String = "",
        @OneToMany(mappedBy = "classes", cascade = [CascadeType.ALL])
        var students: List<Students>?
) {
    override fun toString(): String {
        return "id=${id}, name=${name}"
    }
}