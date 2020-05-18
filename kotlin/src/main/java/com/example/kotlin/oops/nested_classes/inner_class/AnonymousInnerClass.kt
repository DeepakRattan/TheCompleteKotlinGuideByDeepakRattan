package com.example.kotlin.oops.nested_classes.inner_class

/**
 * Created by Deepak Rattan on 18/5/20.
 * Topic : Anonymous Inner Class
 * Description :
 * 1. The object keyword can also be used to create objects of an anonymous class known
 * as anonymous objects. They are used if you need to create an object of a slight
 * modification of some class or interface without declaring a subclass for it .
 *
 * 2. Anonymous objects can be used to define an implementation
 * of an interface or an abstract class without creating a reusable implementation.
 */

interface Shape {
    fun area()
}

fun main() {
    val s = object : Shape {
        override fun area() {
            println("Area method called")
        }
    }
    s.area()
}