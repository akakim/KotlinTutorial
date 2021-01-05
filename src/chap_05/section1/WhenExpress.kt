package chap_05.section1

// switch case 를 간략하게하는 when


/**
  when( 인자 ) {

  }
 */

fun main (){

    val x= 4
    val t = 5

    when (x){
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x 는 1과 2가 아닙니다. ")
        }
    }


    when (t){
        0,1->println ("${t}")
        else -> println ("기타")
    }

    // in 연산자와 범위 지정자 사용

    // is 키워드 함께 사용하기

    val xRange = 22
    when (xRange){
        in 1..10 -> println ("x는 1 이상 10 이하입니다.")
        in 11..20 -> println("x는 10이상 20이하입니다.")
        in 30 downTo 21 ->  println("x는 21이상 30이하입니다")
        else -> println("x는 그 이외의범위입니다.")
    }

    // 다양한 조건을 만들기에는 인수가 없는 when 구문이 더 유리하다.
    when {
        xRange in 1..10 && t in 1..10 -> println ("x는 1 이상 10 이하입니다.")
        xRange in 11..20 -> println("x는 10이상 20이하입니다.")
        xRange in 21..30 ->  println("x는 21이상 30이하입니다")
        else -> println("x는 그 이외의범위입니다.")
    }


}