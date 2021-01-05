package chap_05.section2

fun main(){
//    print("enter the number : ")
//    var number = readLine()!!.toInt()
//    var factorial: Long = 1
//
//    while ( number > 0 ){
//        factorial *= number
//        --number
//    }
//
//    println("Factorial: $factorial")

    // 5 -> 12345, 23451 ,34512

    do {
        print ("Enter the number : ")
        val input = readLine()!!.toInt()

        for (i in 0 until input){
            for(j in 0 until input){
                print( (i+j)%input +1)
            }
            println()
        }

    }while (input != 0 )
}