package app

import data.NewStudent
import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("brock", 22)
    student.sayHello("ellie")
//    use student?. to safety Null
    println(student.upperName)
//    name = brock -> BROCK

    val newStudent = NewStudent("katty", 10, "london")
    println("${newStudent.name}, ${newStudent.age} year, from ${newStudent.school}")

    val newStudent2 = newStudent.copy(name= "Perry")
    println("${newStudent2.name}, ${newStudent2.age} year, from ${newStudent2.school}")

//    katty, 10 year, from london
//    Perry, 10 year, from london
}