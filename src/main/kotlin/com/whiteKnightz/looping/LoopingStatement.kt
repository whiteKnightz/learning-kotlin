package com.whiteKnightz.looping

import com.whiteKnightz.comparators.Customer


fun main() {

    val customers = ArrayList<Customer>()
    customers.add(Customer(1, "Mr", "John", "Larry", null))
    customers.add(Customer(2, "Mrs", "Lara", "John", null))
    customers.add(Customer(3, "Mrs", "Nita", "Stones", null))
    customers.add(Customer(4, "Mr", "Jonny", "Lin", null))

    for (customer:Customer in customers){
        println(customer)
    }
    for ((id, title, firstName, lastName) in customers){
        println("$id: $title $firstName $lastName")
    }

    val customerMap = HashMap<Int, Customer>()
    customerMap.put(1, Customer(1, "Mr", "John", "Larry", null))
    customerMap.put(2, Customer(2, "Mrs", "Lara", "John", null))
    customerMap.put(3, Customer(3, "Mrs", "Nita", "Stones", null))
    customerMap.put(4, Customer(4, "Mr", "Jonny", "Lin", null))

    for ((key, value) in customerMap){
        println("$key -  $value")
    }

    for (i in 0..9){
        println(i)
    }

    (0..9).forEach { println("For each: $it") }
    (9 downTo 0).forEach { println("Down to: $it") }
    (0 until 9).forEach { println("Until: $it") }
    (0..9 step 2).forEach { println("Step 2: $it") }
    ('A'..'L').forEach{ println(it) }
}