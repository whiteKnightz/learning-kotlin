package com.whiteKnightz.variables

import java.math.BigDecimal
import kotlin.math.roundToInt

fun main() {
    val dbl = 24.3
    print("Is dbl a double: ${dbl is Double}")
    print("\nIs dbl a double: ${dbl::class.qualifiedName}")
    print("\ndbl's java class is: ${dbl.javaClass}")
    val myInt = dbl.roundToInt()
    print("\nWhat is myInt: ${myInt::class.qualifiedName}")

    val anotherInt: Int = 16
    val myFloat: Float = 1.1f
    print("\nWhat is myFloat: ${myFloat::class.qualifiedName}")

    val result: Float = myFloat+anotherInt
    print("\nWhat is result: ${result::class.qualifiedName}")
    print("\nWhat is result: ${result}")

    val myBigD = BigDecimal(17)
    print("\nWhat is myBigD: ${myBigD::class.qualifiedName}")
    val myBigD2: BigDecimal
    myBigD2 = myBigD.add(BigDecimal(21))
    print("\nWhat is myBigD2: ${myBigD2}")

    print("\n")
}