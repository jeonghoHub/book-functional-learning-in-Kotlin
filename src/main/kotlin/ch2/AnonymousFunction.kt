package ch2

fun sum(x: Int, y: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(x, y)
}

fun main() {
    val value = sum(5, 10) { x, y -> x + y }
}


