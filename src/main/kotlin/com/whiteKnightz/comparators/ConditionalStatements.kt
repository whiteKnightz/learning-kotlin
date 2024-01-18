package com.whiteKnightz.comparators

import java.util.*

class Customer(val id: Long,
               val title: String,
               val firstName: String,
               val lastName: String,
               var dateOfBirth: Calendar?
){


    val age: Int?
        get() = getAge(dateOfBirth)
    val safeAge: Int
        get(){
//            return if (age!=null) age!! else -1
            return age ?: -1
        }

    var favouriteColor: String? = null


    fun getLastLetter(a: String): String = a.takeLast(1)
    fun getLastLetterOfMyFavouriteColor(): String{
        return favouriteColor?.let { getLastLetter(it) } ?: ""
    }

    fun getColorType(): String{
        val color = getUpperCaseColor()
        return when (color) {
            "" -> "empty"
            "RED", "BLUE", "GREEN" -> {
                "RBG"
            }
            else -> {
                "other"
            }
        }
    }
    fun getUpperCaseColor(): String{
        return favouriteColor?.toUpperCase() ?: ""
    }

    companion object{
        fun getAge(dateOfBirth: Calendar?): Int? {
            if (dateOfBirth==null) return -1

            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR)>=today.get(Calendar.DAY_OF_YEAR)) years-1 else years
        }
    }
}
fun main() {

    val john = Customer(1L, "Mr", "John", "Blue", GregorianCalendar(1997, 4, 17))
    val jane = Customer(1L, "Mrs", "Jane", "Green", null)

    println("The person born on 13th January 1999 is ${Customer.getAge(GregorianCalendar(1999,1,13))} years old")
}