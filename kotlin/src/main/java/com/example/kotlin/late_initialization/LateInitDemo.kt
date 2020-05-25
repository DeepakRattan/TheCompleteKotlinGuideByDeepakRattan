package com.example.kotlin.late_initialization

/**
 * Created by Deepak Rattan on 22/5/20.println()
 * Topic : lateinit
 * Description :
 * 1. Use it with mutable variables only (var)
 * 2. Allowed with only non-nullable data type
 * 3. Need to initialize value before using it
 * 4. While accessing a lateinit variable before initializing ,UninitializedPropertyAccessException is thrown
 */

fun main() {
    val s = Student()
    //println(s.name) // UninitializedPropertyAccessException
    //before accessing the lateinit variable ,we need to initialize it
    //s.name = "Deepak"
    //println("Name is ${s.name}")
    s.setData()
}

class Student {
    lateinit var name: String

    fun setData() {
        name = "DR"
        println("Name is $name")
    }
}