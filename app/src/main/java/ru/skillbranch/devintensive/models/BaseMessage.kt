package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage(
    val id: String,
    val from: User?,
    val chat: Chat,
    val isIncoming: Boolean = false,
    val date: Date = Date()

) {
    abstract fun formatMessage(): String

    companion object Factory {
        private var id = 0
        fun makeMessage(
            from: User,
            chat: Chat,
            date: Date,
            type: String,
            payload: String,
            isIncoming: Boolean = false
        ) = when (type) {
            "text" -> TextMessage(nextId(), from, chat, isIncoming, date)
            "image" -> ImageMessage(nextId(), from, chat, isIncoming, date)
            else -> throw IllegalArgumentException()
        }

        private fun nextId() = id++.toString()
    }
}
