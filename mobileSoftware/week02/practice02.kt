package ddwucom.mobile.week02.kotlintest

import java.util.Random

fun main(){
    val random = Random()
    val muList : MutableList<Int> = MutableList(6, {0})

    for(i in 0..5) {
        val num = random.nextInt(45)
        muList.set(i, num)
    }
    for(index in muList.indices){
        println("${muList[index]}")
    }
}