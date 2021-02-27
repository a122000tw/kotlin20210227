package com.ktest

class KNull {
}

fun main(args: Array<String>) {
    val chinese : Int? = null
    val english : Int? = 90
    val math : Int? = 80
    // 若沒考則放入 null, 計算總分時以 0 分計算
    // 請計算總分
    var sum = (chinese ?: 0) + (english ?: 0) + (math ?: 0)
    println("sum = $sum")
    var sum2 = chinese?.plus(english?: 0) ?: 0
    println("sum2 = $sum2")

}


