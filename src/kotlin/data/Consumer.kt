package data

open class Consumer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type:String): this(name, type, 0)
    constructor(name: String): this(name, "standard")
}

class Premium: Consumer {
    constructor(name: String): super(name, "Premium")
    constructor(name: String, balance: Long): super(name, "Premium", balance)
}

class Executive(name: String, balance: Long) : Consumer(name, "Executive", 0) {
    constructor(name: String): this(name, 0)
}