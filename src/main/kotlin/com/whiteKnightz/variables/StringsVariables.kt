package com.whiteKnightz.variables

var name: String? = null

fun main() {
    printNameWithIf()
    printNameWithWhile()
    println("\n\n")

    name = "Abhishek"
    printNameWithIf()
    printNameWithWhile()
    println("\n\n")

    name = "Abhishek Satyal"
    printNameWithIf()
    printNameWithWhile()
    println("\n\n")

    name = "Vijay"
    printNameWithIf()
    printNameWithWhile()
    println("\n\n")

    modifyName("Vijay Kr. Sharma")
    printNameWithIf()
    printNameWithWhile()
    println("\n\n")
}

private fun printNameWithIf() {
    if (name != null) {
        println(name)
    } else{
        println("No name!")
    }
}

private fun printNameWithWhile() {
    when(name){
        null -> println("Name is null")
        "Abhishek" -> println("Name is Abhishek!")
        "Abhishek Satyal" -> println("Name is Abhishek Satyal!")
        else -> println("Name is: $name")
    }
}

private fun modifyName(nameVal: String){
    name =nameVal
}