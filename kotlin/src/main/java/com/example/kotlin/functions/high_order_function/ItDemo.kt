package com.example.kotlin.functions.high_order_function

/**
 * Created by Deepak Rattan on 19/5/20.
 * Topic : "it" - Implicit name of single parameter in lambda
 * Description :
 * "it" is only relevant inside a lambda with a single parameter.
 * It is the default name for a single parameter and is a shorthand that allows you to omit
 * naming the single parameter .
 */

fun main() {
    //reverseAndDisplay("Deepak") { s -> s.reversed() }
    // When we have single parameter inside lambda simply replace it with "it" keyword
    reverseAndDisplay("Deepak") { it.reversed() }
}

fun reverseAndDisplay(str: String, myLambda: (String) -> String) {
    val res = myLambda(str) // it.reversed()=>str.reversed()=>"Deepak".reversed()=>"kapeeD"
    println("Reversed string is $res")

}