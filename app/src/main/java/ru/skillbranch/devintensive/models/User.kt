package ru.skillbranch.devintensive.models

import java.util.*

class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    var lastVisit: Date? = Date(),
    var isOnline: Boolean = false
) {
    constructor(id: String) : this(id, null, null, null)

    init {
        println("Init")
    }

    fun printMe() = println(
        """
            id: $id
            firstName: $firstName
            lastName: $lastName
            avatar: $avatar
            rating: $rating
            respect: $respect
            lastVisit: $lastVisit
            isOnline: $isOnline
        """.trimIndent()
    )

    companion object Factory {
        private var id = 0;
        fun makeUser(fillName: String): User {
            val name = fillName.split(' ')
            return User(
                id++.toString(),
                firstName = name.firstOrNull(),
                lastName = name.lastOrNull(),
                avatar = null
            )
        }
    }

}