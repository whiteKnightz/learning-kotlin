package com.whiteKnightz.functions

fun main(args: Array<String>) {
    printOutAString("Hello World!")
}

fun printOutAString(value: String) {
    println(value)
    println("The sum of 16d and 19d is: ${addTwoNumber(16.5, 19.5)}")
    printSomeMaths(two = 18.9, one = 23.4)
    printSomeMaths(two = 18.9)
    printSomeMaths(one = 39.9)

    fun innerFunction(str: String){
        println("String value: $str")
    }


    innerFunction("Hello")
    innerFunction("World")
    innerFunction("How")
    innerFunction("Are")
    innerFunction("You")
}

fun lambdaUtilizationFunction(input: String, action: (String)->Int) =
    println(action(input))


fun addTwoNumber(one: Double, two: Double) =
    one+two

fun printSomeMaths(one: Double = 37.3, two: Double = 27.8){
    println("The sum of $one and $two is: ${one+two}")
    println("The difference of $one and $two is: ${one-two}")
}
