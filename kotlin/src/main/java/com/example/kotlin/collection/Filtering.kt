package com.example.kotlin.collection

/**
 * Created by Deepak Rattan on 21/5/20.
 * Topic : Filtering
 * 1. Filtering : a) filter()
 *                b) filterIndexed()
 *                c) filterNot()
 * Description :
 * 1. Filter : Filter desired elements from collection based on some condition .
 * 2. In Kotlin, filtering conditions are defined by predicates.
 * 3. What are predicates ?
 * Ans : Predicates are the lambda functions that take a collection element
 * and return a boolean value: true means that the given element matches
 * the predicate, false means the opposite.
 * 4. The predicates in filter() can only check the values of the elements.
 */

fun main() {
    // Filtering by Predicate
    // 1. filter() method
    println("*******************1. filter() method************************************")
    val numbers = listOf<String>("one", "two", "three", "four", "five")
    println("*****************Original List*********************")
    printList(numbers)
    // Filter the list for words having length > 3
    val res = numbers.filter { it.length > 3 } // or {num -> num >3}
    println("*************List After Filtering******************")
    printList(res)

    val myMap = mapOf<Int, String>(1 to "Java", 2 to "Kotlin", 3 to "Dart", 4 to "Python")
    println("*****************Original Map*********************")
    printMap1(myMap)
    // Filtering condition : key < 4 && value.length > 4
    val mapRes = myMap.filter { (key, value) -> key < 4 && value.length > 4 }
    println("*************Map After Filtering******************")
    printMap1(mapRes)

    // 2. filterIndexed
    /*The predicates in filter() can only check the values of the elements.
     If you want to use element positions in the filter, use filterIndexed().
     It takes a predicate with two arguments: the index and the value of an element.*/
    println("*******************2. filterIndexed() method************************************")
    val res1 = numbers.filterIndexed { index, s -> (index > 0) && s.length < 5 }
    println("************filterIndexed**********************")
    printList(res1)

    // 3. filterNot()
    // To filter collections by negative conditions, use filterNot().
    // It returns a list of elements for which the predicate yields false.

    println("*******************3. filterNot() method************************************")
    val res2 = numbers.filterNot { it.length > 3 }
    printList(res2)

}


fun printList(list: List<String>) {
    for (element in list) {
        print("$element ")
    }
    println()
}

fun printMap1(map: Map<Int, String>) {
    for (key in map.keys) {
        println("Key = $key and value = ${map[key]} ")
    }
    println()
}