package com.whiteKnightz.testings

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.*

class AgeCalculator {
    fun getAge(dob: Calendar): Int{
        val today = Calendar.getInstance()
        val years = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR)
        return if (dob.get(Calendar.YEAR)>today.get(Calendar.YEAR)){
            years-1
        } else {
            years
        }
    }
}

class AgeCalculationTest() {

    @Test
    fun checkAgeWhnBornToday(){
        assertEquals(0, AgeCalculator().getAge(Calendar.getInstance()))
    }
    @Test
    fun checkAgeWhnBorn1000DaysAgo(){
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, -1000)
        assertEquals(2, AgeCalculator().getAge(date))
    }
}