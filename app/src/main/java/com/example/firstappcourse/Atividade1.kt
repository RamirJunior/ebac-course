package com.example.firstappcourse

fun main(){
    val motoca = Motocycle()
    val carritcho = Car()

    carritcho.increaseVelocity()
    carritcho.increaseVelocity()
    println("Velocidade ${carritcho.model} = ${carritcho.getCurrentVelocity()} M/h")
    carritcho.decreaseVelocity()
    println("Velocidade ${carritcho.model} = ${carritcho.getCurrentVelocity()} M/h")

    motoca.increaseVelocity()
    println("Velocidade ${motoca.model} = ${motoca.getCurrentVelocity()} M/h")
    motoca.increaseVelocity()
    motoca.increaseVelocity()
    println("Velocidade ${motoca.model} = ${motoca.getCurrentVelocity()} M/h")
}

class Car() : Vehicle(){
    override var acceleration: Long = 0
    override var model: String = "Batmovel"
    override fun increaseVelocity() {
        this.velocity += 10
    }

    override fun decreaseVelocity() {
        this.velocity -= 10
        if (velocity < 0) velocity = 0
    }
}

class Motocycle() : Vehicle(){
    override var acceleration: Long = 5
    override var model: String = "Ghost Rider"

    override fun increaseVelocity() {
        this.velocity += 8
    }

    override fun decreaseVelocity() {
        this.velocity -= 8
        if (velocity < 0) velocity = 0
    }
}

abstract class Vehicle() {
    var velocity: Long = 0
    abstract var acceleration: Long
    abstract var model: String

    abstract fun increaseVelocity()
    abstract fun decreaseVelocity()
    fun getCurrentVelocity() = velocity
}
