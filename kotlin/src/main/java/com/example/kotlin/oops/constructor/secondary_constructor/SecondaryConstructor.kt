package com.example.kotlin.oops.constructor.secondary_constructor

/**
 * Created by Deepak Rattan on 13/5/20.
 * Topic : Secondary Constructor
 *
 * Description : 1. A class in Kotlin can have a primary constructor and
 * one or more secondary constructors.
 *
 * 2. Secondary constructors are not that common in Kotlin.
 * The most common use of secondary constructor comes up when you need
 * to extend a class that provides multiple constructors that initialize
 * the class in different ways
 */

fun main() {
    val a = Add(10, 20, 30)


}

// Class Add with one primary constructor and one secondary constructor
class Add(a: Int, b: Int) {
    
    // We can not write any code of initialization in the primary constructor.
    // To achieve this task, we use an initializer block called init() to initialize the member variables
    // with the constructor variables. This init() block is executed at the time of object creation.
    init {
        println("Primary constructor")
        println("Sum = ${a + b}")
    }

    //Secondary constructor

    // If the class has a primary constructor, each secondary constructor needs to
    // delegate to the primary constructor, either directly or indirectly through another
    // secondary constructor(s). Delegation to another constructor of the same class is done
    // using the this keyword .

    constructor(a: Int, b: Int, c: Int) : this(a, b) {
        println("Secondary constructor")
        println("Sum = ${a + b + c}")
    }

}