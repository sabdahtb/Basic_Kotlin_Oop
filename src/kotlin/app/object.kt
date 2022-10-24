package app

import data.Car
import data.Person

fun main() {
    // Call object Properties
    val eko = Person()
    eko.age = 17

    println("Eko is ${eko.age} and ${eko.eat}")

    // call object with constructors
    val bmw = Car("BMW", 10)

    println("The ${bmw.carName} is ${bmw.year} years old")

}