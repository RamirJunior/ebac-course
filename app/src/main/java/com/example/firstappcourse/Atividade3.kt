package com.example.firstappcourse

fun main() {
    val factory = VehicleFactory()
    val motoca = factory.createVehicle(2)
    val carritcho = factory.createVehicle(1)

    val vehicleList: List<Vehicle> = mutableListOf(motoca, carritcho)

    vehicleList.forEach { vehicle ->
        vehicle.increaseVelocity()
        println("${vehicle.model} velocity = ${vehicle.velocity} M/h")
    }
}

class VehicleFactory {
    fun createVehicle(option: Int): Vehicle {
        return when (option) {
            1 -> Car()
            2 -> Motocycle()
            else -> Truck() //Sugestão
        }
    }
}

class Truck() : Vehicle() {
    override var acceleration: Long = 0
    override var model: String = "Scania"

    override fun increaseVelocity() {
        this.velocity += 15
    }

    override fun decreaseVelocity() {
        this.velocity -= 15
        if (velocity < 0) velocity = 0
    }
}
