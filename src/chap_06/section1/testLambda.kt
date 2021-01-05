package chap_06.section1

/**
 * 클로저 예시,
 * 람다식 내부에서 외부의 선언된 변수에 접근하는 기능.
 * 람다식 안에 있는 외부 변수 값을 유지 하기 위한 기술.
 * 람다가 어떤 방법을 통해 가지고간 변수
 */
class Calc{
    fun addName(a: Int,b: Int,add : (Int, Int ) -> Unit){
        println( "Start AddName ")
        println("$a , $b")
        add(a,b) // 외부 변수를 연산한다.
        add(a,b)
        println("Enc Double Name ")
    }
}

fun main(){

    val calc = Calc()
    var result = 0      // 외부 변수
    calc.addName(3,4){x,y-> result= x+y }
    println(result)
}