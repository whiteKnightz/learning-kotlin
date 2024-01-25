package com.whiteKnightz.functionalProgramming

fun toSentenceString(input: String): String = input[0].toUpperCase()+input.substring(1)

fun applySomeFunctionToString(input: String, function: (String) -> String):String = function.invoke(input)

fun manipulateList(){
    val colors = listOf("red", "blue", "green", "black", "white")

    val upperCaseColors = colors.map { it.toUpperCase() }

    upperCaseColors.forEach{ println(it) }

    println("\n\nColors starting with B:")
    upperCaseColors.filter { it.startsWith("B") }.forEach{ println(it) }

    println("\n\nColors after flat map:")
    upperCaseColors.flatMap { if (it.startsWith("B")) listOf(it, it) else listOf(it) }.forEach{println(it)}

    println("\n\nColors after reduce:")
    println(upperCaseColors.reduce { result, value -> "$result, $value " })

    println("\n\nColors after fold:")
    val colorLen = upperCaseColors.map { it.length }
    println("Sum of color lengths list is: ${colorLen.sum()}")
    println("Avg. of color lengths list is: ${colorLen.average()}")
    println("Count of color lengths list is: ${colorLen.count()}")



    println("\n\nColors after fold:")
    println(colorLen.fold(100) {result, value -> result+value})
    println(colorLen.fold(0) {result, value -> if(value>result) value else result})
}

fun manipulateMap(){
    println("\n\nMap manipulation")
    val myMap = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    myMap.filter { it.value.startsWith("f") }.forEach{ println("$it") }
}

fun main() {
    println(toSentenceString("hello"))
    val applySomeFunctionToString1 = applySomeFunctionToString("hello world") { it[0].toUpperCase()+it.substring(1)}
    println(applySomeFunctionToString1)
    val applySomeFunctionToString2 = applySomeFunctionToString("hello world", ::toSentenceString)
    println(applySomeFunctionToString2)
    manipulateList()
    manipulateMap()
}

