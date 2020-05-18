package com.example.kotlin.functions.extension_functions

/**
 * Created by Deepak Rattan on 13/5/20.
 * Topic - Extension Function
 *
 * Description - 1. Kotlin provides the ability to add more
 * functionality to the existing classes, by without inheriting them.
 * 2. This is achieved through a feature known as extensions.
 * 3. When a function is added to an existing class it is known as Extension Function
 * 4. The new functions added behaves like static
 * 5. Extension function become part of our own class e.g Student
 */

fun main() {
    val s = Student()
    val res = s.isPassed(45)
    println("Student passed ? $res")

    val intl = s.isIntelligent(95)
    println(intl)
}

// User defined class
class Student {
    fun isPassed(marks: Int): Boolean {
        return marks > 40
    }
}

// Extension function for user defined class
fun Student.isIntelligent(marks: Int): Boolean = marks > 90