package data

import java.util.*

object Utils {
    const val name: String = "brock"

    fun toUpper(value: String): String {
        return value.uppercase(Locale.getDefault())
    }
}

class Companions {
    companion object Applications {
        fun toUpper(name: String): String {
            return name.uppercase(Locale.getDefault())
        }
    }
}