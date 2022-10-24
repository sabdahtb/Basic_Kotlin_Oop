package data

class Person {
    // Object Properties
    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 0

    // eat is immutable cause use val
    val eat: Boolean = true

    //create initializer block
    init{
        println("initializer block has been called")
    }
}