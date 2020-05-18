package com.example.kotlin.oops.inheritance

/**
 * Created by Deepak Rattan on 14/5/20.
 * Topic : Method Overriding
 */
fun main() {
    //val a = Animal1()
    // a.eat()
    val d = Dog1()
    d.eat()
    println(d.color)

}
// By default classes are public and final .Hence can not be inheritable
// Make it open for inheritance using open keyword
open class Animal1 {
    // By default fields are public and final .Hence can not be overridden
    // To override the field in Subclass make it open
    open var color = "White"

    // By default functions and final and public.Hence can not be overridden
    // To override the function in Subclass ,make it open
    open fun eat() {
        println("Animal Eating")
    }
}

class Dog1 : Animal1() {
    //
    override var color = "Black"

    override fun eat() {
        super<Animal1>.eat()
        println("Dog eating")
    }

}