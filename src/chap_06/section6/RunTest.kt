package chap_06.section6

/**
 * run() 활용
 * 인자가 없는익명 함수 처럼 동작하는 형태로 단독 사용하거나
 * 확장 함수 형태로 호출하는 두가지 형태로 사용할 수 있습니다.
 */
fun main(){


    //apply 와 run 비교
    data class Person(var name: String, var skills : String)
    var person = Person("KyoLyeong", "Kotlin, Android")

    var returnObj = person.apply {
        name = "Myeong"
        skills = "Android"
        "success" // 사용되지 않음.
    }

    print(person)
    println("return Obj : ${returnObj}")

    var returnObj2 = person.run {
        name = "GayYun"
        skills = "Java, C#"
        "success" // 사용되지 않음.
    }

    print(person)
    println("return Obj2 : ${returnObj2}")



}