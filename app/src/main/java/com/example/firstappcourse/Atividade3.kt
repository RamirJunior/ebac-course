package com.example.firstappcourse

fun main(){

    println(UtilityHelper.isWeekend())

}

object UtilityHelper {
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    fun setCurrentDay(day: DayOfWeek) {
        this.currentDay = day
    }

    fun isWeekend() : Boolean {
        return (currentDay == DayOfWeek.SUNDAY) || (currentDay == DayOfWeek.SATURDAY)
    }
}
