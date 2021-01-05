package chap_04.section3



fun main(){

    val source = " Hello World"
    val target = "Kotlin "
    println(source.getLongString(target))
}
// 확장 함수.
//String을 확장해 getLongString 추가.
// 이 파일 내부에서만 사용할 여지가 좋은거같다.

fun String.getLongString(target: String) : String =
        if( this.length > target.length ) this else target