package app

import data.Radio

fun main() {
    val radio = Radio()

//    println(radio.name) // ERROR cause late init and not init yet

//    init radio First
    radio.initRadio()
    println(radio.name)
//    RCC [PRINTLN]
}