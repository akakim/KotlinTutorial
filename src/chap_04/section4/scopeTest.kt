package chap_04.section4

var global = 20

fun main(){


    fun localFunc1(){
        println("local println ")
    }

    localFunc1()

    println("global ${global}")
    global = 15
    println("global ${global}")
    val local =4
    userFunc()
    println("global ${global}")
}

fun userFunc(){
   global = 4
}