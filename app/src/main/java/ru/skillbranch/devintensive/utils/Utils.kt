package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(name:String?): Pair<String?, String?> {
        val parts = name?.split(" ")
        return Pair(parts?.firstOrNull(), parts?.lastOrNull())
    }
}