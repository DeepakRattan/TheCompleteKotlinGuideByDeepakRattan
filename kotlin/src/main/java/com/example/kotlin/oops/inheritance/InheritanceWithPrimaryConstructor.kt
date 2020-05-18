package com.example.kotlin.oops.inheritance

/**
 * Created by Deepak Rattan on 14/5/20.
 * Topic : Inheritance with Primary Constructor
 */

fun main() {
    val d = Dog2("Black", "Pug")

}

// Super class with primary constructor
open class Animal2(color: String) {
    init {
        println("Superclass init : color = $color")
    }
}

//Subclass with Primary constructor
class Dog2(color: String, breed: String) : Animal2(color) {
    init {
        println("Subclass init : color = $color and breed = $breed")
    }
}