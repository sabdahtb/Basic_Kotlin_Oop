package app

import data.Manager

fun main() {
    val manager = Manager("kyle")
//    .sayHello is from Manager parent
    manager.sayHello("Brock")
//    name = Brock, this.name = kyle
}