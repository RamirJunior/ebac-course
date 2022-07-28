package com.example.firstappcourse

class Modulo4Exercicio5 {
}

fun main() {
    val stringList: List<String> = listOf("Leonardo","Raphael", "Michelangelo", "Donatello")
    val concatList = stringList.map { "Olá $it" }

    concatList.forEach {
        println(it)
    }
}
