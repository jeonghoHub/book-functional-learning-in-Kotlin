package ch2


// {}로 감싸져 있는 부분은 타입 추론을 하지 않음으로 반환 타입을 항상 명시해야함
// 명시하지 않으면 unit이라는 타입을 반환 자바의 void와 유사함
fun twice1(value: Int): Int {
    return value * 2
}

// 한 줄로 구성되는 경우 코드블록과 return 생략 가능
fun twice2(value: Int): Int = value * 2

// = 연산자는 타입 추론가능 즉 반환 타입 생략 가능
fun twice3(value: Int) = value * 2

