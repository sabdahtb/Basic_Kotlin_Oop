package app

import data.*

fun main() {
    val manager = Manager("kyle")
//    .sayHello is from Manager parent
    manager.sayHello("Brock")
//    name = Brock, this.name = kyle [PRINTLN]

//    Call an override function
    val president = President("kite")
    president.sayHello("ken")
//    Hello my name is ken and i am override function child of kite [PRINTLN]

    // call super property
    val rectangle = Rectangle()
    println("rectangle corner = ${rectangle.corner}, parent = ${rectangle.parentCorner}")

//    call super fun
    val square = Square()
    square.printName()

//    implement super.constructor
    val premiumCustomer = Premium("kite", 0)
    println(premiumCustomer.name)
//    kite [PRINTLN]

//    super for executive
    val executiveCustomer = Executive("kite")
    println(executiveCustomer.name)
//    kite [PRINTLN]

//    Any class
    println(executiveCustomer.toString())
//    data.Executive@6b884d57 [PRINTLN]
}