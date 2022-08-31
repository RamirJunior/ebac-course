package com.example.firstappcourse

fun main(){

    val todayIs: DayOfWeek? = DayOfWeek.WEDNESDAY

    when(todayIs) {
        DayOfWeek.MONDAY -> println("Hoje é ${todayIs.day}")
        DayOfWeek.SUNDAY -> println("Hoje é ${todayIs.day}")
        DayOfWeek.TUESDAY -> println("Hoje é ${todayIs.day}")
        DayOfWeek.WEDNESDAY -> println("Hoje é ${todayIs.day}")
        DayOfWeek.THURSDAY -> println("Hoje é ${todayIs.day}")
        DayOfWeek.FRIDAY -> println("Hoje é ${todayIs.day}")
        DayOfWeek.SATURDAY -> println("Hoje é ${todayIs.day}")
        else -> println("Dia inválido")
    }
}

enum class DayOfWeek(val day: String) {
    SUNDAY("domingo"),
    MONDAY("segunda-feira"),
    TUESDAY("terça-feira"),
    WEDNESDAY("quarta-feira"),
    THURSDAY("quinta-feira"),
    FRIDAY("sexta-feira"),
    SATURDAY("sábado")
}
