package com.基礎語法

class KVars {
}

fun getPrice(): Int {
    return 100
}

fun main(args: Array<String>) {
    // 宣告變數
    var x = 10; // 可再指派變數 var
    x = 1
    println(x)
    val y = 20 // 不可再指派變數 val
    // y = 1
    println(y)
    // var or val 變數名稱 : 變數型態 = 初始值
    val pi: Double = 3.14 // val pi = 3.14
    println(10 / 2)
    println(1 / 2)
    println(0.1 + 0.1 == 0.2)
    println(0.1 + 0.1 + 0.1 == 0.3) // IEEE754
    // 印出資料
    // BMI 練習
    val h = 170.0
    val w = 60.0
    val bmi = w / Math.pow(h / 100, 2.0)
    println(bmi)
    println("bmi: %.2f".format(bmi))
    println("bmi: $bmi")
    println("bmi: ${bmi * 2}")
    var price = 100
    println("cost = ${price * 0.4}")
    println("cost = ${getPrice() * 0.4}")
    // 簡單轉型
    var a: Int = 10
    var b: Short = a.toShort()
    println("$a $b")
    var e: Float = 1.23f
    var intMax = Int.MAX_VALUE // Int 相當於 Ingeter
    // 動動腦
    var chinese: String = "100"
    var english = "90"
    var math: String? = "80"
    // math = null
    // 請算出總分?
    var sum = chinese.toInt() + english.toInt() + math?.toIntOrNull()!!
    println("sum = $sum")
    // 動動腦2
    val c : Int = "100".toInt()
    val d : Int? = "abc".toIntOrNull() ?: 0 // 如果得到 null 就產生 0 給 d 變數
    println(c)
    println(d)
    val f : Int? = null?.toIntOrNull() ?: -1
    println(f)


}