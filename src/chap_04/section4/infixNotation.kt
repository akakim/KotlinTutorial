package chap_04.section4

// 중위 표현범

fun main(){

    // 일반 표현법
    val multi = 3.multiply(4)
    println( "Multiply ${multi}")
}


infix fun Int.multiply(x:Int): Int{
    return this * x
}