package com.example.kotlin.collection

/**
 * Created by Deepak Rattan on 21/5/20.
 * Topic : Set - contains unique elements
 *      1. Immutable Set - setOf() method
 *      2. Mutable Set - mutableSetOf(),hashSetOf() method
 */
fun main() {
    // 1. Immutable set - Read Only
    // setOf() method
    println("---------------setOf() ----------------------")
    val set = setOf<Int>(1, 2, 3, 4, 5, 5)
    printSetElement(set)
    // 2 .Mutable Set - Read And Write
    // a) mutableSetOf()
    val ms = mutableSetOf<Int>(1, 2, 3, 4, 5, 5, 5, 5)
    println("---------------mutableSetOf()----------------------")
    printSetElement(ms)
    ms.add(10)
    printSetElement(ms)
    //b. hashSetOf()
    println("--------------hashSetOf()-----------------------")
    val hs = hashSetOf<Int>(1, 2, 3, 4, 5, 5, 5, 5)
    printSetElement(hs)
}

fun printSetElement(s: Set<Int>) {
    println("*****************************")
    for (element in s) {
        println(element)

    }
    println("*****************************")

}