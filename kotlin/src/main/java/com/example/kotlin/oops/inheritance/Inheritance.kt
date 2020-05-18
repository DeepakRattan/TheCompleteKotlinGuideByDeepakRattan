package com.example.kotlin.oops.inheritance

/**
 * Created by Deepak Rattan on 14/5/20.
 * Topic : Inheritance
 */

fun main() {
    var d = Dog()
    d.color = "Black"
    d.breed = "Labra"
    d.bark()
    d.eat()
}

//Super class
open class Animal {
    var color = ""
    fun eat() {
        println("Eat")
    }
}

//Subclass
class Dog : Animal() {
    var breed = ""
    fun bark() {
        println("Bark")
    }
}