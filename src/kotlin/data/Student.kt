package data

import java.util.*

class Student(val name: String, val age: Int)

fun Student.sayHello(name: String) {
    println("hello $name, my name is ${this.name}, ${this.age} years old")
}

val Student.upperName: String
    get() = this.name.uppercase(Locale.getDefault())