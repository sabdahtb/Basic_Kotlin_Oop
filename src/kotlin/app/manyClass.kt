package app

import data.*

fun operaion(val1: Int, val2: Int, operation: Operation): Int {
    return  when (operation) {
        is Minus -> val1 - val2
        is Plus -> val1 + val2
        is Modulo -> val1 % val2
        else -> 0
    }
}

fun fireAction(action: Action) {
    action.action()
}

class SampleAction: Action {
    override fun action() {
        println("print by anonymous function")
    }
}

fun main() {
//    sealed class implement
    println(operaion(10,10, Plus()))
    println(operaion(10,5, Minus()))
    println(operaion(10,3, Modulo()))

//    inner class implement
    val brock = Boss("brock")
    val employee1 = brock.Employee("him")
    val employee2 = brock.Employee("yu")

//    call fun inside inner class
    employee1.hiBoss()
    employee2.hiBoss()

//    implement anonymous class
    fireAction(SampleAction())

    val man = Gender.MALE
    val woman = Gender.FEMALE

    println("$man, $woman")
}