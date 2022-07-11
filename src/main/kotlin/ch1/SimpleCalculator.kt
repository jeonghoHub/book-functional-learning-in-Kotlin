package ch1

//fun main(args: Array<String>) {
//    val calculator = SimpleCalculator()
//
//    println(calculator.calculate('+', 3, 1))
//    println(calculator.calculate('-', 3, 1))
//}
//
//class SimpleCalculator {
//    fun calculate(operator: Char, num1: Int, num2: Int): Int = when (operator) {
//        '+' -> num1 + num2
//        '-' -> num1 - num2
//        else -> throw IllegalAccessException()
//    }
//}

// 위 코드는 명령형으로 짜여진 계산기 곱셈이나 나눗셈을 추가하려면 calculate 함수가 변경되어야 함.
// 덧셈이나 뺄셈 기능에 영향을 줄 수 있다. 결합도가 높고 응집도가 낮은 함수

//fun main(args: Array<String>) {
//    val plusCalculator = OopCalculator(Plus())
//    println(plusCalculator.calculate(1, 4))
//}
//
//interface Calculator {
//    fun calculate(num1: Int, num2: Int): Int
//}
//
//class Plus: Calculator {
//    override fun calculate(num1: Int, num2: Int): Int {
//        return num1 + num2
//    }
//}
//
//class Minus: Calculator {
//    override fun calculate(num1: Int, num2: Int): Int {
//        return num1 - num2
//    }
//}
//
//class OopCalculator(private val calculator: Calculator) {
//    fun calculate(num1: Int, num2: Int) = calculator.calculate(num1, num2);
//}
//
// 위 코드는 객체지향적으로 인터페이스를 이용해 쉽게 기능을 확장 할 수 있고 의존성 주입 덕분에 테스트하기 쉬운 코드

//fun main(args: Array<String>) {
//    val fpCalculator = FpCalculator()
//    println(fpCalculator.calculate({ num1 , num2 -> num1 + num2}, 3, 1))
//}
//
//class FpCalculator {
//    fun calculate(calculator: (Int, Int) -> Int, num1: Int, num2: Int): Int = calculator(num1, num2)
//}
//
//일급 함수를 사용해 계산기에서 가장 중요한 로직을 추상화 했음 ex {num, num2 -> num1 + num2}
//비즈니스 로직을 구현하기 위한 인터페이스와 구현 클래스가 사라짐 코드도 간결해지고 유지보수도 쉬워짐
//함수형 프로그래밍은 입출력 타입만 동일하다면 별도의 클래스 추가없이 계산 기능을 덧붙일 수 있다.
