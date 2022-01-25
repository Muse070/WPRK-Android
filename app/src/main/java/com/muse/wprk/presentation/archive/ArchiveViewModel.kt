package com.muse.wprk.presentation.archive

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class ArchiveViewModel() {


    // Get List of dates for the archive
    fun getArchiveList(): List<LocalDate> {
        val currentDay = LocalDate.now()
        val days: MutableList<LocalDate> = mutableListOf()
        var startDate = currentDay.minusDays(13)
        for (i in 0..13) {
            days.add(startDate)
            startDate = startDate.plusDays(1)
        }
        return days
    }

    // Convert the format of the current day to a list
    private fun getDayToList(day: LocalDate): List<String> {
        val formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
        return day.format(formatter).split(" ")
    }

    // Get Month
    fun getMonth(day: LocalDate): String {
        val list = getDayToList(day)
        return list[1].take(3)
    }

    // Get Day of Week
    fun getDayOfWeek(day: LocalDate): String {
        val list = getDayToList(day)
        return list[0].take(3)
    }

    // Get date
    fun getDate(day: LocalDate): String {
        val list = getDayToList(day)


        return list[2].removeSuffix(",")
    }

}