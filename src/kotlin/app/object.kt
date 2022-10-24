package app

import data.Car
import data.Person

fun main() {
//    Call object Properties
    val eko = Person()
    eko.age = 17

    println("Eko is ${eko.age} and ${eko.eat}")
//    initializer block has been called [PRINTLN]
//    Eko is 17 and true [PRINTLN]

//     call object with constructors
    val bmw = Car("BMW", 10)

    println("The ${bmw.carName} is ${bmw.year} years old")
//    The  is 0 years old [PRINTLN]

//    call a second constructor
    val toyota = Car("My car")
    println(toyota.carName)
//    Secondary constructors 2
//    My car

}