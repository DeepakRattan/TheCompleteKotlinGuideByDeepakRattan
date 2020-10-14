package com.example.kotlin.functions.extension_functions

/**
 * Created by Deepak Rattan on 13/5/20.
 * Topic : Extension Function
 * Description : 1. In Kotlin we can add function to predefined class using
 * the concept of extension function.
 * 2. Extension function become part of predefined classes e.g. String ,Int etc .
 */

fun main() {
    val firstName = "Deepak"
    val lastName = " Rattan"
    firstName.add(lastName)

    val str = firstName.removeFirstLastChar()
    println("After removing first and last character of first Name : $str")

    val a = 50
    val b = 100
    val g = a.greaterNumber(b)
    println("Greater number is $g")

}

// Extension function for predefined classes

// Extension function add is the newly added method in String class
fun String.add(s: String) = println(this + s)

// Extension function to remove first and last character of a string
fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)

// Extension function greaterNumber added to predefined Int class  
fun Int.greaterNumber(num: Int): Int = if (this > num) this else num


