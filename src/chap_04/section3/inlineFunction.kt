package chap_04.section3

inline fun shortFunc(a: Int,out: (Int) -> Unit){
    println("Hello")
    out(a)
    println("GoodBye")
}
//inline fun crossInLineshortFunc(a: Int,out: crossInline (Int) -> Unit){
//    println("Hello")
//    out(a)
//    println("GoodBye")
//}



fun main(){
    shortFunc(3){
        println("a:$it")

    }
}