package com.example.kotlin.oops.objects

/**
 * Created by Deepak Rattan on 18/5/20.
 *
 * Topic : a) Object Declarations
 * Description :
 * 1. Singleton is an object-oriented pattern where a class can have only
 * one instance (object).
 * 2. Kotlin provides an easy way to create singletons using the
 * object declaration feature. For that, object keyword is used.
 *
 * Topic : b) Object Expression
 * Description:
 * The object keyword can also be used to create objects of an anonymous class
 * known as anonymous objects. They are used if you need to create an object of
 * a slight modification of some class or interface without declaring a subclass for it.
 *
 */
// 1. Object Declaration
object Test : Person() {
    const val a = 10
    fun foo() {
        println("foo called")
    }

    override fun pray() {
        println("Testing Pray")
    }
}

// 2. Object Expression

// The object keyword can also be used to create objects of an anonymous class
// known as anonymous objects. They are used if you need to create an object of
// a slight modification of some class or interface without declaring a subclass for it.

open class Person {
    fun eat() = println("Eating food")
    open fun pray() = println("Praying God")
}

fun main() {
    // Test Object Declaration feature
    println(" a = ${Test.a}")
    Test.foo()
    Test.pray()

    // Test Object Expression
    val atheist = object : Person() {
        override fun pray() = println("I am an atheist .I don't pray")

    }
    atheist.eat()
    atheist.pray()


}