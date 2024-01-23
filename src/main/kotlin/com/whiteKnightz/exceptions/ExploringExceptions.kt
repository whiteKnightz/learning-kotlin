package com.whiteKnightz.exceptions

import java.io.FileInputStream
import kotlin.jvm.Throws

@Throws(InterruptedException::class)
fun divide(a:Int,b:Int): Double{
    Thread.sleep(1000)
    return (a as Double/b)
}

fun printFile(){
    val input =  FileInputStream("file.txt")

    input.use {
        //an exception will occur here
    }
}
fun main() {
    val result = try{
        divide(5,23)
    } catch (ex: Exception){
        println(ex.message)
        0
    }

    println(result)
}