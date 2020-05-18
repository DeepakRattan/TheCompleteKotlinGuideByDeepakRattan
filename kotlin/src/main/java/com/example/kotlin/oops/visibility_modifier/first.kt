package com.example.kotlin.oops.visibility_modifier

/**
 * Created by Deepak Rattan on 14/5/20.
 * Topic : Visibility Modifier
 * Description : 1. public - default modifier (Visible everywhere)
 *               2. private - Visible in a class (Class member)
 *                          - Visible in a file (Top level declaration)
 *               3. protected - visible in subclasses
 *               4. internal - visible in a module
 *
 */
fun main() {
    val t = Test()
    t.testing()
}

// By default first function is public and can be accessed anywhere
fun first() {
    println("First")
}

private fun show() {
    println("show")
}

internal fun myInternal() {
    println("Internal")
}

class Test {
    fun testing() {
        val p = Person()
        println("Public Variable a = ${p.a}")
        println("Internal Variable = ${p.d}")
        // Private and protected variables of Person class are not visible
    }
}

open class Person {
    //public variable
    val a = 10

    //private
    private val b = 20

    //protected
    protected val c = 30

    //internal
    internal val d = 40
}

class Indian : Person() {
    // a,c,d are visible
    // b is not visible

    fun display() {
        println("a = $a")
        // b being private is not accessible
        //println("b = $b")
        println("c = $c")
        println("d = $d")
    }
}
