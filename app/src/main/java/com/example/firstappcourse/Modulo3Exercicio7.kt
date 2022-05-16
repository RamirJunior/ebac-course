package com.example.firstappcourse

class Modulo3Exercicio7 {
}

fun main() {
    var soma: Int = 0
    val lista: MutableList<Int> = mutableListOf()

    for (i in 0..98){
        lista.add(i+1)
        soma += lista[i]
    }
    println("Soma = $soma")
}