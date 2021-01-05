package chap_06.section1

/**
 * 람다식을 사용하는 코틀린의 표준 라이브러리에서
 * let(), apply(),with(),also(),run ()등 여러 표준함수를 제공하고 있다.
 * 표준함수 들은 대략 확장함수 형태의 람다식으로 구성되어있다.
 *
 * */

fun main(){

    val score : Int? = 32
    // var score = null

    // 일반적인 null 검사
    fun checkScore(){
        if( score !=null ){
            println("Score: $score")
        }

    }

    fun checkScoreLet(){

        // 1 널 검사 안해도 이렇게 할 수 있다.
        score?.let {
            println{"Scope: $it"}
        }
        //2
        val str = score.let{
            it.toString()
        }

        println(str)
    }

    checkScore()

    checkScoreLet()

    // chaining

    var a=1
    val b=2

    a = a.let { it +2 }.let{
        println("a+ $a")
        val i = it + b
        i
    }
    // 최종적으로 i 값이 a 에 할당되서 5가 나옵니다.


    // 중첩사용 할 때 바깥에 하나만 반환하는 점을 참조하자.
    var x = 10

    x.let { outer ->
        outer.let{
            inner->

            print("Inner is $inner and outer is $outer ")
        }
        "Outer String" //이 문자열이 할된다.
    }

    //null 가능성있는 객체에서 let() 활용하기.
    // 안드로이드 예시

    /**
     * var obj : String?
     * if (null = obj){
     *    Toast.makeText(context,obj, Toast.Length_SHORT).show()
     * }
     *
     * obj?.let{
     *    Toast.makeText(context,obj , Toast.Length_SHORT).show()
     * }
     * 아래의 코드로 널 검사를 한뒤에 메세지를 보여줄 수있다.
     * 아니면 아무것도 하지 않는다.
     */

    // else 문 대체하기.
    val firstName:String? = "first KIM"
    var lastName:String? = "testLast"
    if( null != firstName){
        println( "$firstName $lastName")
    } else {
        print(lastName)
    }

    // let을 사용하는 경우
    firstName?.let{ print ("wow simple and clean code \n $it $lastName")} ?: print("$lastName")

}