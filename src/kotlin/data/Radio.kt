package data

interface NewRadio {
    val name: String
    fun sayHello(name: String)
}

class Radio {
    lateinit var name: String

    interface NewRadio {
    val name: String
    fun sayHello()
}

    fun initRadio() {
        name = "RCC"
    }
}

class NewsRadio(override val name: String): NewRadio {
    override fun sayHello(name: String) {
        println("hello $name my name is ${this.name}")
    }
}