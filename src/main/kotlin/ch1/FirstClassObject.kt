package ch1

//Any를 함수의 매개변수로 넘길 수 있음
//fun doSomeThingWithAny(any: Any) {
//
//}

//Any를 함수의 반환값을 돌려 줄 수 있음.
fun doSomeThingWithAny(): Any {
    return Any();
}

//Any를 List 자료구조에 담을 수 있음
var anyList: List<Any> = listOf(Any())