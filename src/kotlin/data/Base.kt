package data

interface Base {
    fun sayHello(name: String)
}

class MyBase: Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class BaseDelegate(val base: Base) : Base by base {
    override fun sayHello(name: String) {
        println("bye $name")
    }
}