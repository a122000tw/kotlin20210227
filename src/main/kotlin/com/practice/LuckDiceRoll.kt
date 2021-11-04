package com.practice

class LuckDiceRoll {
}

fun main() {
//    val num = 4
//    if (num > 4) {
//        println("The variable is greater than 4")
//    } else if (num == 4){
//        println("The variable is equal to 4")
//    } else {
//        println("The variable is less than 4")
//    }
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val myLuckyNumber = 4
    if (rollResult == myLuckyNumber) {
        println("You win!")
    } else {
        println("So sorry! You rolled a ${rollResult}. Try again!")
    }
    when (rollResult) {
        myLuckyNumber -> println("You win!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }
}