package com.example.firstappcourse

fun main(){
    val motoca = Moto()
    val carritcho = Carro()

    carritcho.increaseVelocity()
    println("Velocidade ${carritcho.model} = ${carritcho.getCurrentVelocity()} M/h")
    carritcho.decreaseVelocity()
    println("Velocidade ${carritcho.model} = ${carritcho.getCurrentVelocity()} M/h")

    motoca.increaseVelocity()
    println("Velocidade ${motoca.model} = ${motoca.getCurrentVelocity()} M/h")
    motoca.increaseVelocity()
    println("Velocidade ${motoca.model} = ${motoca.getCurrentVelocity()} M/h")
}

class Carro() : Veiculos{
    override var velocity: Long = 0
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

class Moto() : Veiculos{
    override var velocity: Long = 0
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

interface Veiculos {
    var velocity: Long
    var acceleration: Long
    var model: String

    fun increaseVelocity()
    fun decreaseVelocity()
    fun getCurrentVelocity() = velocity
}
