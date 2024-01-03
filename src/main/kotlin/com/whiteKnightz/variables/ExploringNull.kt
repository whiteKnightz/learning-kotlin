package com.whiteKnightz.variables

fun main() {
    var name: String? = null

    println(name?.toUpperCase())
    name = "Matt"
    println(name?.toUpperCase())

    var address: String?= null
    println(address?.toUpperCase())
    address = "Toronto, ON, Canada"
    println(address?.toUpperCase())
    address=null
}