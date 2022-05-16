package com.example.firstappcourse

class Modulo3Exercicio4 {
}

fun main (){
    val impar: Int = 11
    val par: Int = 22

    when(par % 2){
        0 -> println("O número é par.")
        else -> println("O número é ímpar.")
    }

    when(impar % 2){
        0 -> println("O número é par.")
        else -> println("O número é ímpar.")
    }
}