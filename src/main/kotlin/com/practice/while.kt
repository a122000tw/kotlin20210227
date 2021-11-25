package com.practice

class `while` {
}

fun main() {
    val guestPerFamily = listOf(2, 1, 4, 3)
    var totalGuests = 0
    var index = 0

    while (index < guestPerFamily.size) {
        totalGuests += guestPerFamily[index]
        index++
    }
    println("Total Guest Count: $totalGuests")

    val names = listOf("Jessica", "Henry", "Alicia", "Jose")
    for (name in names) {
//        println(name)
        println("$name - Number of characters: ${name.length}")
    }

}