package app

import data.Laptop
import data.SmartPhone

private fun printObj(any: Any) {
    if(any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if(any is SmartPhone) {
        println("Smartphone with name ${any.name}")
    } else {
        println(any.toString())
    }
}

private fun printWhen(any: Any) {
    when(any){
        is Laptop -> println("Laptop with name ${any.name}")
        is SmartPhone -> println("Smartphone with name ${any.name}")
        else -> println(any.toString())
    }
}

fun main() {
    printObj("kitty")
    printObj(2)
    printObj(Laptop("lenovo"))
    printObj(SmartPhone("asus", ""))
//    kitty
//    2
//    Laptop with name lenovo
//    Smartphone with name asus
    printWhen("kitty")
    printWhen(2)
    printWhen(Laptop("lenovo"))
    printWhen(SmartPhone("asus", ""))
//    Same output
}