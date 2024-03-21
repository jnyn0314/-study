package ddwucom.mobile.week02.kotlintest

import kotlin.math.pow

fun main(){
    println("키를 입력하시오. (cm 단위): ")
    val height = readLine()!!.toFloat()
    println("몸무게를 입력하시오. (kg 단위): ")
    val weight = readLine()!!.toFloat()

    val meterHeight = (height / 100)
    val bmi = weight / (meterHeight * meterHeight)

    val rslt = when(bmi){
        in 0.0..18.5 -> "저체중"
        in 18.5..23.0 -> "정상"
        in 23.0..25.0 -> "과체중"
        else -> "비만"
    }
    println("결과 : ${rslt}")

}