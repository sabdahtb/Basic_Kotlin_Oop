package data

class Boss(val name: String) {
    inner class Employee(val name: String) {
        fun hiBoss() {
            println("hi boss ${this@Boss.name} my name is $name")
        }
    }
}