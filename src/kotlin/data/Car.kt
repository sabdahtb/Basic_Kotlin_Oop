package data

// constructor
class Car(carName: String, year: Int? = 10, name: String? = "" ) {

    // create second constructor
    constructor(carName: String, name: String): this(carName, null, name) {
        println("Secondary constructors 1")
    }
    constructor(carName: String): this(carName, null,  null) {
        println("Secondary constructors 2")
    }

    val carName: String = carName
    var year: Int? = year
    var name: String? = name
}