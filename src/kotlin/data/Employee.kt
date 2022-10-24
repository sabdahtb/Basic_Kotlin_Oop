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

open class Shape {
    open val corner: Int = 1
    open fun printName() {
        println("Shape")
    }
}

// inheritance
// Employee = Parent
class Manager(name: String) : Employee(name) {}

class President(name: String) : NewEmployee(name) {
// Open fun is can make to override fun
    final override fun sayHello(name: String) {
        println("Hello my name is $name and i am override function child of ${this.name}")
    }
}

// Will ERROR cause final override
//class NewPresident(name: String) : President(name) {
//    override fun sayHello(name: String) {
//        println("Hello my name is $name and i am override function child of ${this.name}")
//    }
//}

class Rectangle : Shape() {
    override val corner: Int = 8
//    super is from parent (Shape)
    val parentCorner: Int = super.corner
}

class Square: Shape() {
    override fun printName() {
        println("Square")
//        printName() from parent (must open)
        super.printName()
    }
}