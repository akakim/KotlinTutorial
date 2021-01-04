package kotlin.chap_04


fun main(){

    var result : Int

    result = highOrder( {x,y -> x + y },1,4)

    println (result);

}

fun highOrder( sum: (Int,Int) -> Int, a:Int, b:Int):Int{
    return sum(a,b)
}