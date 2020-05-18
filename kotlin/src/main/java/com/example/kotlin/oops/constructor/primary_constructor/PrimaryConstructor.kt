package com.example.kotlin.oops.constructor.primary_constructor

/**
 * Created by Deepak Rattan on 13/5/20.
 * Topic - Primary Constructor
 * Description : 1. Constructor is used to initialize the properties/field of a class at the time of object creation
 *               2. The primary constructor is part of the class header.
 *               3. The block of code surrounded by parentheses after class name is the primary constructor
 *               4. If the constructor has annotations or visibility modifiers,
 *               the constructor keyword is required, and the modifiers go before it
 */

fun main() {
    val r = Rectangle(10, 20)
    // As soon as Rectangle(10, 20) is executed init{} block is executed
    // Student("DR")
}

// Primary Constructor
// Kotlin program of primary constructor with initializer block

// Primary constructor is used to initialize the member variables of a class.

class Rectangle(_length: Int, _breadth: Int) {
    private var length: Int = 0
    private var breadth: Int = 0

    // We can not write any code of initialization in the primary constructor,
    // then how will our goal be achieved?
    // To achieve this task, we use an initializer block called init() to initialize the member variables
    // with the constructor variables. This init() block is executed at the time of object creation.

    init {
        length = _length
        breadth = _breadth
        println("Length = $length")
        println("Breadth = $breadth")
    }
}

// To specify the visibility of the primary constructor of a class,
// we need to add an explicit constructor keyword):
class Student private constructor(_name: String) {
    val name = _name

}