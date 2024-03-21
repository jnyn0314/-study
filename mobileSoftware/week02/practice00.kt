package ddwucom.mobile.week02.kotlintest

fun main(){
    println("숫자 입력:")
    val numbers = Array<Int>(5){ readLine()!!.toInt() }

    var total : Int = 0
    for(number in numbers){
        total += number
    }

    println("총합: $total 평균 : ${total / 5}")
}
