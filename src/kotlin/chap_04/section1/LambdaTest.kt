package kotlin.chap_04.section1

fun main (){
    val result : Int

    // 람다함수 { 인자 -> 반환 값  }
    val multi = { a: Int ,b: Int-> a+b}
    val multi_2 : (a:Int, b: Int ) -> Int  = { a, b-> a+b}

    val multi_print = {a: Int,b:Int ->
        println("a: $a b: $b")

        a * b
    }
    println( "multi 1 : " + multi(3,4))
    println( "multi 2 : " +  multi_2(3,4))

    multi_print(4,4)



///    val nestedLambda
}