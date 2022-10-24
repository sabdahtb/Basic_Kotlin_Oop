package app

import data.Car
import data.NewPerson
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
//    Secondary constructors 2 [PRINTLN]
//    My car [PRINTLN]

    val newPerson = NewPerson("mike", 12)
    newPerson.age = 13
    println("${newPerson.userName} is ${newPerson.age}")
//    mike is 13 [PRINTLN]

//    call a function inside class
    newPerson.callMe()
//    hello mike [PRINTLN]
}