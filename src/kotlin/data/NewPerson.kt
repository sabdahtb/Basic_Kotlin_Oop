package data

// properties inside constructor
class NewPerson(var userName: String, var age: Int) {
    // create function inside class

    fun callMe() {
        println("hello $userName")
    }

    fun sayHello(name: String): Unit {
        println("hello $name")
    }

    fun sayHello(name: String, age: Int): Unit {
        println("hello $name, you are $age years old now")
    }

//    implement this
    fun sayThis(userName: String) {
        println("userName from prop = $userName, userName from class = ${this.userName}")
    }
}