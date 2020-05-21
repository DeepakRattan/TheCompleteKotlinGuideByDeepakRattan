package com.example.kotlin.collection

/**
 * Created by Deepak Rattan on 21/5/20.
 * Topic : Array
 * Description : Array is Mutable and have fixed size .
 */
fun main() {
    // Create Array of 5 integers where each value is zero
    val arr = Array<Int>(5) { 0 }
    //printArrayUsingForEachLoop(arr)
    printlnArrayUsingIndices(arr)
    //Array is mutable i.e array element can be changed
    arr[2] = 20
    //printArrayUsingForEachLoop(arr)
    printlnArrayUsingIndices(arr)

}

//Printing array element using for each loop
fun printArrayUsingForEachLoop(ar: Array<Int>) {
    for (i in ar) {
        print("$i ")
    }
    println()
}

// Printing array element using indices
fun printlnArrayUsingIndices(ar: Array<Int>) {
    for (index in ar.indices) {
        println("Element at position $index is ${ar[index]}")
    }
    println("--------------------------------")
}