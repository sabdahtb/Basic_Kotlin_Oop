package app

import data.Person

fun main() {
    // Call object Properties
    val eko = Person()
    eko.age = 17

    println("Eko is ${eko.age} and ${eko.eat}")
}