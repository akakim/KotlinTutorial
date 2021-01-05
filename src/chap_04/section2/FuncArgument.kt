package chap_04.section2

fun sum( a:Int, b: Int) : Int{
    return a + b
}

fun mul (a :Int,b: Int): Int{
    return a * b
}

fun main(){

    var result = sum (10, 10 )
    var result2 = mul(sum(10,10) , 40)

    println ("result : $result result2 $result2")

}