package chap_05.section2


/**
 * 하행 반복 downTo
 * 필요한 단계 증가 step
 * 혼합 사용용3,3,1
 */
fun main(){
    var total = 0

    for (num in 0..99 step 2){ // 홀수 합.
        total += num
    }

    print("$total")
}