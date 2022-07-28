package com.example.firstappcourse

class Modulo4Exercicio1 {
}

fun main() {
    val num1: Int = 32
    val num2: Int = 58
    val result = somaNum(num1,num2)

    println("Primeira soma = $result")
    println("Segunda soma = ${somaNum(16, 20)}")
}

fun somaNum(num1: Int, num2: Int) : Int {
    return num1+num2
}
