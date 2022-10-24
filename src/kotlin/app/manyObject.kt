package app

import data.BaseDelegate
import data.Companions
import data.MyBase
import data.Utils

fun main() {
    // call prop and fun inside singleton obj
    println(Utils.name)
    println(Utils.toUpper("katty"))

    // call companion object
    println(Companions.toUpper("barry"))

    val myBase = MyBase()
    myBase.sayHello("mama")

    val classDelegate = BaseDelegate(myBase)
    classDelegate.sayHello("papa")
}