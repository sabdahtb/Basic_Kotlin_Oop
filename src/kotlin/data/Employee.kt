package data

open class Employee(private val name: String) {
    fun sayHello(name: String) {
        println("name = $name, this.name = ${this.name}")
    }
}

open class NewEmployee(val name: String) {
    open fun sayHello(name: String) {
        println("name = $name, this.name = ${this.name}")
    }
}

// inheritance
// Employee = Parent
class Manager(name: String) : Employee(name) {}

class President(name: String) : NewEmployee(name) {
// Open fun is can make to override fun
    override fun sayHello(name: String) {
        println("Hello my name is $name and i am override function child of ${this.name}")
    }
}