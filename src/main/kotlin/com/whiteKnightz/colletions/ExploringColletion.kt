package com.whiteKnightz.colletions

fun main() {
    val colors = listOf("Red", "Green", "Blue")

    val days = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val numbers = mutableListOf<Int>()

    val months = mutableSetOf("Jan", "Feb")
    val webColors = mutableMapOf("Red" to "FF0000", "Blue" to "00FF00", "Green" to "0000FF")

    val intArray: IntArray = intArrayOf(1,2,3,4,5,6)
    intArray.set(3, -4)
    intArray.forEach { println("Int Array: $it") }

    println("The second color is : ${colors[1]}")
}