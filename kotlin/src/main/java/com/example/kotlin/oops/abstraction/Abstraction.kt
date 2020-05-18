package com.example.kotlin.oops.abstraction

/**
 * Created by Deepak Rattan on 14/5/20.
 * Topic : Abstraction
 */
// abstract classes and abstract functions are open by default
abstract class Shape {
    abstract var name: String
    abstract fun area()
}

class Rectangle(length: Int, breadth: Int) : Shape() {
    private var length: Int = 0
    private var breadth: Int = 0
    override var name: String = "Rectangle"

    init {
        this.length = length
        this.breadth = breadth
        println("Length = $length")
        println("Breadth = $breadth")
    }

    override fun area() {
        println("Area = ${length * breadth}")
    }

}

fun main() {
    val r = Rectangle(10, 20)
    r.area()
}