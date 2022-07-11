package ch2

fun test() {
    val max: Int
    val x = 3;
    val y = 5;

    //if문이 표현식이 아닌언어는 if문을 "구문"으로만 사용할 수 있다.
    if(x > y) {
        max = x
    } else {
        max = y
    }
    //코틀린에서 if문은 기본적으로 표현식이다. 표현식은 구문과 달리 결과로서 어떤 값을 반환함.
    //※ 사용할 시엔 else문 필수
    val max1: Int = if(x > y) x else y

    val collection = listOf(1,2,3)

    for (item in collection) {
        print(item)
    }

    for ((index, item) in collection.withIndex()) {
        println("the element at $index is $item")
    }

    for (i in 1..30) {
//        print("$i ")
    }

    //until은 미만까지 출력 30제외
    for (i in 1 until 30) {
//        print("$i ")
    }

    //downto은 step의 증감 규칙으로 출력
    for (i in 10 downTo 0 step 2) {
        print("$i ")
    }
}

fun main() {
    test()
}