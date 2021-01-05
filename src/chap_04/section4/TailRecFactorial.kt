package chap_04.section4

// 스택을 사용하지않음.
// 스택오퍼 플로우 방지하기.
fun main(){
    val number= 5
    println("Factorial: $number ${factorial(number)})")
}

tailrec fun factorial(n: Int,run: Int = 1): Long{
    return if (n == 1) run.toLong() else factorial(n-1,run * n )
}