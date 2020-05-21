package com.example.kotlin.collection

/**
 * Created by Deepak Rattan on 21/5/20.
 * Topic : Immutable map - mapOf()
 *         MutableMap - mutableMapOf(),hashMapOf(),HashMap
 */
fun main() {
    // mapOf() - Immutable,read only ,fixed size
    println("----------mapOf()-------------------")
    val myMap = mapOf<Int, String>(2 to "Raj", 30 to "Aman", 16 to "Rohan")
    printMap(myMap)
    // Mutable Map
    // 1.mutableMapOf() method
    // mutable,read and write both,no fixed size
    println("------mutableMapOf()--------------")
    val mutableMap = mutableMapOf<Int, String>()
    mutableMap.put(2, "raj")
    mutableMap.put(20, "rajan")
    mutableMap.put(12, "ravi")
    printMap(mutableMap)

    //2. hashMapOf() method
    // mutable,read and write both,no fixed size
    println("--------hashMapOf()-------------------")
    val hm = hashMapOf<Int, String>()
    hm.put(2, "raj")
    hm.put(20, "rajan")
    hm.put(12, "ravi")
    printMap(hm)

    //3. HashMap class
    // mutable,read and write both,no fixed size
    println("--------HashMap-------------------")
    val hm1 = HashMap<Int,String>()
    hm1.put(2, "raj")
    hm1.put(20, "rajan")
    hm1.put(12, "ravi")
    printMap(hm1)
    hm1.replace(2,"Raj Kumar")
    println("After replacing raj by Raj Kumar")
    printMap(hm1)


}

fun printMap(map: Map<Int, String>) {
    println("*****************************************")
    for (key in map.keys) {
        println("Key = $key and value = ${map[key]}")
    }
    println("*****************************************")
}
