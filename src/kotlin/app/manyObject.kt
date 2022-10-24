package app

import data.Companions
import data.Utils

fun main() {
    // call prop and fun inside singleton obj
    println(Utils.name)
    println(Utils.toUpper("katty"))

    println(Companions.toUpper("barry"))
}