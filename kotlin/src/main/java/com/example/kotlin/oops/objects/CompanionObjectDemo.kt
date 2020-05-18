package com.example.kotlin.oops.objects

/**
 * Created by Deepak Rattan on 18/5/20.
 * Topic : Companion Object
 * Description :
 * 1. An object declaration inside a class can be marked with the companion keyword.
 * 2. Members of the companion object can be called by using simply the class name as the qualifier.
 * 3. The name of the companion object can be omitted, in which case the name Companion will be used:
 * 4. If you are familiar with Java, you may relate companion objects with static methods
 * (even though how they work internally is totally different).
 */

class Animal {
    companion object Test {
        fun eat() = println("Animal Eat meat")
    }
}

fun main() {
    Animal.eat()
}