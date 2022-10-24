package data

// properties inside constructor
class NewPerson(var userName: String, var age: Int) {
    // create function inside class

    fun callMe() {
        println("hello $userName")
    }
}