package com.whiteKnightz.classes

class Customer(
    val name: String,
    val address: String,
    var age: Int
) {
    constructor(name: String,age: Int): this(name, "", age)

}

class AlternativeCustomer(val name: String, var age: Int){
    var address: String
    init {
        address = ""
    }

    constructor(name: String, age: Int, address: String): this(name, age){
        this.address = address
    }

    operator fun component1() = name
    operator fun component2() = address
    operator fun component3() = age
}

data class AnotherAlternativeCustomer(val name: String,
                      val address: String = "",
                      var age: Int){
    var approved: Boolean = false
        set(approved){

            if (age>=19){
                field = approved
            } else{
                println("Not possible to change approval for customer below 19 years old")
            }
        }

    val nextAge = age+1

    fun upperCaseName() = name.toUpperCase()

    override fun toString(): String {
        return "$name | $address | $age"
    }

    companion object{
        fun getInstance() = AnotherAlternativeCustomer(name = "Jack", address = "Hamilton, ON, Canada", age = 25)
    }
}

fun main() {
    val customer: AnotherAlternativeCustomer = AnotherAlternativeCustomer(name = "Abhishek", address = "Toronto, ON, Canada", age = 21)
    println("Customer ${customer.name} is ${customer.age} years old")
    customer.age = 27
    customer.approved = true
    println("Now, customer ${customer.name} is ${customer.age} years old")

    val customer1: AnotherAlternativeCustomer = AnotherAlternativeCustomer(name = "Satyal", age = 24)
    println("Now, customer ${customer1.name} is ${customer1.age} years old")

    val instanceCustomer = AnotherAlternativeCustomer.getInstance()

    println(instanceCustomer.toString())

    val (name, address, age) = instanceCustomer
}