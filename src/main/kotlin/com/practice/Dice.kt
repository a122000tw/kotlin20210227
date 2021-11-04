package com.practice

class Dice(val numSides: Int) {


    fun roll(): Int {
        return (1..numSides).random()
    }
}

fun main() {
    val myFirstDice = Dice(20)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(6)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}