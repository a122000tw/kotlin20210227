package com.類別與物件.巢狀與內部類別
/*
*巢狀類別 :
* Java: static class A (位於某個類別內的定義)
* Kotlin: class A (位於某個類別內的定義)
*
* 內部類別 :
* Java class B (位於某個類別內的定義)
* Kotlin: inner class B (位於某個類別內的定義)
 */


class Outer { // 一般/外部類別
    val x = 100 // 物件成員變數
    class A { // 巢狀類別
        fun print() {
            println("A $this")
        }
    }
    inner class B { // 內部類別
        fun print() {
            println("B $this")
        }
    }

}

fun main() {
    val a = Outer.A()
    a.print()
    val b = Outer().B()
    b.print()
}