package chap_05.section1

fun main(){
    val a = 15;
    val b = 8

    val max = if (a > b){
        println("a서택")
        a
    }
    else {
        println( "b 선택")
        b
    }

    println(max)
}