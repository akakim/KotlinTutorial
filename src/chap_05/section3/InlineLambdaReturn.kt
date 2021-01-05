package chap_05.section3

fun main(){
//    testFunc()
    testFunc2()

//    val testLamb = lambda
}

inline fun inlineLambda(a: Int,b: Int,out : (Int, Int) -> Unit ){
    out(a,b)
}


// return 문을 만나게 되면 inlineLambda 문에서 끝나게 된다.
// 이를 방지하려면.?
fun testFunc(){
 println("Start Of Func")
    inlineLambda(23,4) {a,b->
        val result = a + b
        if (result > 10) return
    }

    println ("end of Func")
}
fun testFunc2(){
 println("Start Of Func2")
    // 라벨을 사용한 블록의 끝부분으로 반환 .
    // lit@ 이걸 라벨 이라고 부른다.
    inlineLambda(0,4) lit@{a,b->
        val result = a + b
        if (result > 10) return
    }
    // 이 부분으로빠져나간다.

    println ("end of Func2")
}