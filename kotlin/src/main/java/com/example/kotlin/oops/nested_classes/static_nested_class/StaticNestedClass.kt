package com.example.kotlin.oops.nested_classes.static_nested_class

/**
 * Created by Deepak Rattan on 18/5/20.
 * Topic : Nested Class\
 * Description : 1. Kotlin allows you to define a class within another class known as nested class.
 * 2. The nested class in Kotlin is similar to static nested class in Java.
 * 3. A nested class in Kotlin with no explicit modifiers is the same as a static nested class
in Java. To turn it into an inner class so that it contains a reference to an outer class,
you use the inner modifier.
 4. Nested class (doesn’t store a reference to an outer class) Like static class in java

 */
class Outer {
    val a = "Outer class"

    class Nested {
        val b = "Inner class"
        // fun callMe()= a // error : Nested class can not access the member of outer class
        fun callMe() = println("Function call from Nested Class")
    }
}

fun main() {
    //Accessing member of Nested class
    println(Outer.Nested().b)
    //Creating object of Nested class
    val nested = Outer.Nested()
    nested.callMe()
}