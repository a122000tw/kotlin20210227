package com.practice

class List {
}

fun main() {
//    val numbers = listOf(1, 2, 3, 4, 5, 6)
//    println("List: $numbers")
//    println("Size: ${numbers.size}")
//
//    // Access elements of the list
//    println("First element: ${numbers[0]}")
//    println("Second element: ${numbers[1]}")
//    println("Last index: ${numbers.size -1}")
//    println("Last element: ${numbers[numbers.size -1]}")
//    println("First: ${numbers.first()}")
//    println("Last: ${numbers.last()}")
//
//    // Use the contains() method
//    println("Contains 4? ${numbers.contains(4)}")
//    println("Contains 7? ${numbers.contains(7)}")

    // 不可變列表
    val colors = listOf("green", "orange", "blue")
    println("Reversed list: ${colors.reversed()}")
    println("List: $colors")
    println("Sorted list: ${colors.sorted()}")
    val oddNumbers = listOf(5, 3, 7, 1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")


    // 可變列表
    val entrees = mutableListOf<String>()
    println("Entrees: $entrees")

    // Add individual items using add()
    println("Add noodles: ${entrees.add("noodles")}")
    println("Entrees: $entrees")
    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    // Add a list of items using addAll()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")

    // Remove an item using remove()
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")

    // Remove an item using removeAt() with an index
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    // Clear out the list
    entrees.clear()
    println("Entrees: $entrees")

    // Check if the list is empty
    println("Empty? ${entrees.isEmpty()}")

}