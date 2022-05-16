package com.example.firstappcourse

class Modulo3Exercicio6 {
}

fun main(){
    val lista: MutableList<Int> = mutableListOf()

    for (i in 0..98){
        lista.add(i+1)
        println("${lista[i]} ")
    }
}