package com.example.firstappcourse

class Modulo4Exercicio3 {
}

fun main(){
    val a = 6
    val b = 4

    println("Operação de soma = ${calculadora(a,b,::somaNum)}")
    println("Operação de multiplicação = ${calculadora(a,b,::multiplicaNum)}")
}

fun calculadora(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x,y)
}
