package kotlin.chap_04


fun main(){
    val result = callByValue( lambda())
    println (  result )
}

fun callByValue( b: Boolean ) :Boolean{
    println ("callBy Value function ")
    return b
}

var lambda : ()->Boolean = {
    println ("lambda function ")
    true
}