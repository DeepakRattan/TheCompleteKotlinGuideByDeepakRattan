package com.example.kotlin.oops.inheritance

/**
 * Created by Deepak Rattan on 14/5/20.
 * Topic : Inheritance with secondary constructor
 */
fun main() {
    val d = Dog3("Black", "Pug")
}

// Superclass with Secondary Constructor
open class Animal3 {
    var color: String = ""

    //Secondary Constructor
    constructor(color: String) {
        this.color = color
        println("Superclass : color is $color")

    }

}

//Subclass with secondary constructor
class Dog3 : Animal3 {
    var breed: String = ""

    //Secondary Constructor
    constructor(color: String, breed: String) : super(color) {
        this.breed = breed
        println("Subclass : color is $color and breed is $breed")

    }

}