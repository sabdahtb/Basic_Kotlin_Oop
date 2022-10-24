package data

open class Employee(private val name: String) {
    fun sayHello(name: String) {
        println("name = $name, this.name = ${this.name}")
    }
}

// inheritance
// Employee = Parent
class Manager(name: String) : Employee(name) {}

class President(name: String) : Employee(name) {}