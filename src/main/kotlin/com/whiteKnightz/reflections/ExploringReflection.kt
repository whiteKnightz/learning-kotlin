package com.whiteKnightz.reflections

import com.whiteKnightz.classes.AnotherAlternativeCustomer
import com.whiteKnightz.classes.Customer
import kotlin.math.roundToInt
import kotlin.math.sqrt

//fun isPrime(num: Int): Boolean {
//    if (num == 2 ) {
//        return true
//    }
//    if (num % 2 == 0) {
//        return false
//    }
//    for (n in (num - 1 downTo 3)) {
//        if (num % n == 0) return false
//    }
//    return true;
//}

fun isPrime(num: Int): Boolean {
    val maxNumToCheck = sqrt(num.toDouble()).roundToInt()
    for (i in 2..maxNumToCheck){
        if (num%i==0) return false
    }
    return true
}

fun main(args: Array<String>) {
    val myList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
//    val myList = (1 until 21)
    myList.filter(::isPrime).forEach { println("$it is prime") }
//    (1 until 21).filter(::isPrime).forEach { println("$it is prime") }

    val customer: AnotherAlternativeCustomer = AnotherAlternativeCustomer(name = "Abhishek", address = "Toronto, ON, Canada", age = 21)
    println(customer::class.members)
}