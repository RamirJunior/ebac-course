package com.example.firstappcourse

fun main(){
    val word = "I love Android"

    word.toList()
}

fun String.toList() = this.forEach { println(it) }
