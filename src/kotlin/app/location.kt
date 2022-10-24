package app

import data.City
import data.Tiger

fun main() {
    // cant import Location cause the abstract class
    val city = City("Tokyo")
    println(city.name)

    val tiger = Tiger()
    tiger.run()
}