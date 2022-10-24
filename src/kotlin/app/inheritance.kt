package app

import data.Manager
import data.President
import data.Rectangle
import data.Square

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
}