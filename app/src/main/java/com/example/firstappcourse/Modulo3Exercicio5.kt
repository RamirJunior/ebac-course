package com.example.firstappcourse

class Modulo3Exercicio5 {
}

fun main (){
    val meuArray: IntArray = IntArray(40)

    for (i in meuArray.indices){
        if (i != 0) {
            meuArray[i] = i
            print("${meuArray[i]} ")
        }
    }
}