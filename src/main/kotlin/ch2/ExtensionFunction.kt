package ch2

fun Int.product(value: Int): Int {
    return this * value
}

fun String.product(value: String): String {
    return "$this $value"
}

fun main() {
    println("Hello".product("World"));
    println(10.product(2))
}