package chap_05.section1

fun main(){

    print("Enter the score")

    val score = readLine()!!.toDouble()
    var grade = 'a'

    // 범위 연산사 in
    if (score >= 90.0 ){
        grade = 'a'
    } else if (score >= 80.0 && score < 90.0 ){
        grade = 'b'
    } else {
        grade = 'c'
    }



    if (score >= 90.0 ){
        grade = 'a'
    } else if ( score in 80.0 .. 89.9 ){
        grade = 'b'
    } else {
        grade = 'c'
    }

    for (x in 1 until 9 ) {
        for (y in 1 until 9) {
            //println("${x} " + " * $[y} = ")
            println("${x} * ${y} = ${x}")
        }
    }
}