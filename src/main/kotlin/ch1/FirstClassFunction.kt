package ch1


//함수를 함수의 매개변수로 넘길 수 있다.
fun doSomeThing(func: Int) {
    val testInt = 1;
}

//함수를 함수의 반환값으로 돌려 줄 수 있다.
fun doSomeThing(): (Int) -> String {
    return { value -> value.toString() }
}

var funcList: List<(Int) -> String> = listOf{it.toString()}

fun main(args: Array<String>) {
    doSomeThing();
}

