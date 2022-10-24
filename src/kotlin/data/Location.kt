package data

open abstract  class Location(val name: String) {}

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class City(name: String) : Location(name)

class Tiger: Animal() {
    override val name: String = "Tiger"
    override fun run() {
        println("$name run")
    }
}
class Lion: Animal() {
    override val name: String = "Lion"
    override fun run() {
        println("$name run")
    }
}

