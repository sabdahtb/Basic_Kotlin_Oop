package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("brock", 22)
    student.sayHello("ellie")
//    use student?. to safety Null
    println(student.upperName)
//    name = brock -> BROCK
}