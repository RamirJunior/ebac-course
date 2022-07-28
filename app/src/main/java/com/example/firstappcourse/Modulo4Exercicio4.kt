package com.example.firstappcourse

class Modulo4Exercicio4 {
}

fun main() {
    val myList = returnList()
    val pairsList = myList.filter { it % 2 == 0 }

    print(pairsList)
}

fun returnList(): List<Int> = (1..99).toList()
