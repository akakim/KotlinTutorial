package chap_04.section4

fun a() = b() // 최상위 함수 이므로 b() 함수 선언 위치 관계없이 선언이 가능하다.
fun b() = println("b")

//fun c(){
//    fun d() = e() // 오류 d() 는 지역함수이고 e의 이름을 모른다.
//    fun e() = println("E")
//}

fun main(){
    a() // 최상위 함수는 어디서든 호출 될 수  있다.
//    e() //
}