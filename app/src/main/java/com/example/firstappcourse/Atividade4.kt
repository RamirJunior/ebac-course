package com.example.firstappcourse

fun main(){

    // modificando o Singleton para Segunda-feira usando uma classe
    val modifyingSing = ModifierClass()
    println(UtilityHelper.isWeekend())

    // modificando o Singleton para domingo usando uma função
    modifySingleton(DayOfWeek.SUNDAY)
    println(UtilityHelper.isWeekend())
}

class ModifierClass{
    init {
        UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    }
}

fun modifySingleton(day: DayOfWeek) = UtilityHelper.setCurrentDay(day)
