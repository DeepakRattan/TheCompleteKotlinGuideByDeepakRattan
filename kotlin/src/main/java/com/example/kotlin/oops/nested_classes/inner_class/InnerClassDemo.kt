package com.example.kotlin.oops.nested_classes.inner_class

/**
 * Created by Deepak Rattan on 18/5/20.
 * Topic : Inner Class
 *
 * Description :
 * 1. A nested class in Kotlin with no explicit modifiers is the same as
 * a static nested class in Java. To turn it into an inner class so that it contains
 * a reference to an outer class, you use the inner modifier.
 *
 * 2. Inner class stores a reference to an outer class
 *
 * 3. The syntax to reference an instance of an outer class in Kotlin also differs from Java.
 * You write this@Outer to access the Outer class from the Inner class.
 *
 */

class Outer {
    val a = "Outer class"

    inner class Inner {
        val b = "Inner Class"
        fun callMe() = a
    }
}

fun main() {
    println(" ${Outer().Inner().callMe()}")




}