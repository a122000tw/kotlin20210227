package com.ktest

class Rect(val h:Int, val w: Int) {
    val area: Int = h * w
    // 是否是矩形?
    val isSquare: Boolean
        get() {
            return h == w
        }
}

fun main() {
    val rect = Rect(10, 10)
    println(rect.area)
    println(rect.isSquare)
}