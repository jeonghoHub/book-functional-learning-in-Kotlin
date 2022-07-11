package ch1

val infiniteValue = generateSequence(0) { it + 50000}

fun main(args: Array<String>) {
    infiniteValue.take(1000000000).forEach {print("$it")}
}
