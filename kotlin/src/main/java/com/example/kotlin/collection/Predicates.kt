package com.example.kotlin.collection

/**
 * Created by Deepak Rattan on 21/5/20.
 * Topic : Predicates
 *         means condition that return true or false
 *
 *         1. all - Do all the elements satisfy the predicate/condition?
 *         2. any - Do any element in the list satisfy the predicate?
 *         3. count - Total elements that satisfy the predicate
 *         4. find - return the first element that satisfy the predicate
 */

fun main() {
    val numbers = listOf<Int>(10, 20, 30, 40, 50)
    val myPredicate = { num: Int -> num > 10 }
    //val allRes = numbers.all { it > 10 } // Are all the elements greater that 10? false
    val allRes = numbers.all(myPredicate)
    println(allRes)
    val anyRes = numbers.any { it > 10 } // Any element > 10 ? True
    println(anyRes)
    val countRes = numbers.count { it > 10 } // Number of elements satisfy the given predicate
    println(countRes)
    val findRes =
        numbers.find { it > 10 } // return the first number that matches the given predicate
    println(findRes)
}