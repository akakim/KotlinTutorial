package chap_04.section4

// 중위 표현범

fun main(){

    // 일반 표현법
    val multi = 3.multiply(4)
    val test = 4.strPlus("testString :: ")
    println( "Multiply ${multi}")

    println("str Plus $test")
}

infix fun Int.strPlus(x:String) : String{
    return "$x version $this"
}

infix fun Int.multiply(x:Int): Int{
    return this * x
}