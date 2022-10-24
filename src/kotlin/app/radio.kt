package app

import data.NewsRadio
import data.Radio

fun main() {
    val radio = Radio()

//    println(radio.name) // ERROR cause late init and not init yet

//    init radio First
    radio.initRadio()
    println(radio.name)
//    RCC [PRINTLN]

    val newRadio = NewsRadio("katty")
    newRadio.sayHello("black")
//    hello black my name is katty [PRINTLN]
}