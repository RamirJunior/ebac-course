package com.example.firstappcourse

fun main(){
    val carritcho = Vehicle()

    carritcho.increaseVelocity()
    carritcho.increaseVelocity()
    println("Velocidade atual = ${carritcho.getCurrentVelocity()} M/h")

    carritcho.decreaseVelocity()
    println("Velocidade atual = ${carritcho.getCurrentVelocity()} M/h")
    carritcho.decreaseVelocity()

    println("Velocidade atual = ${carritcho.getCurrentVelocity()} M/h")
    carritcho.decreaseVelocity()

    println("Velocidade atual = ${carritcho.getCurrentVelocity()} M/h")
}

class Vehicle {
    private var velocity: Long = 0
    private var acceleration: Long = 10
    var model: String = "Fuskerrari"

    fun increaseVelocity(){
        println("Acelerando o $model... vrum, VRUUM!")
        this.velocity += acceleration
    }

    fun decreaseVelocity(){
        println("Desacelerando o $model... Hmm, será que estaciono por aqui?")
        this.velocity -= acceleration
        if (velocity < 0){
            velocity = 0
            println("Já estacionei meu $model pra esperar sua avaliação! :)")
        }
    }

    fun getCurrentVelocity() = velocity
}
