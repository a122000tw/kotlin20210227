package com.進階控制.內聯函數

/*
* 內聯函式: inline / noinline
 */
fun text() {
    var x = 1
    hello()
    print(x)
}

inline fun hello() { // 程式碼搬移
    var a = 1
    var b = 2
    var c = a + b
    println(c)
}
/*
* 實際上在編譯之後程式碼會長成:
* fun text() {
    var x = 1
    var a = 1
    var b = 2
    var c = a + b
    println(c)
    print(x)
}
 */
fun main() {
    text()
}