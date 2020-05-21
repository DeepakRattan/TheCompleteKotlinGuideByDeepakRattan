package com.example.kotlin.collection

/**
 * Created by Deepak Rattan on 21/5/20.
 * Topic : List and MutableList
 * 1. List is immutable (read Only ) and have fixed size
 *    listOf() method is used to create immutable list
 * 2. MutableList is mutable,no fixed size ,can add or remove elements
 *    Mutable List can be created using : mutableListOf(),immutableListOf() methods and ArrayList class
 *
 */
fun main() {
    //List is Immutable(read Only) and fixed size
    val list = listOf<String>("Java", "Kotlin", "Android", "Dart", "Flutter")
    printListUsingForEachLoop(list)
    printListUsingIndices(list)
    //list[3]="PHP" // Not allowed for list as list is immutable

    //MutableList
    // 1. mutableListOf() method can be used to create mutable list
    val mutableList = mutableListOf<String>("Java", "Kotlin", "Android", "Dart", "Flutter")
    println("Mutable List Before change ")
    printListUsingIndices(mutableList)
    mutableList[0] = "PHP"
    println("Mutable List After change ")
    printListUsingIndices(mutableList)

    val names = mutableListOf<String>()
    names.add("DR")
    names.add("Vijay")
    names.add("Ajay")
    names.add("Raman")

    printListUsingIndices(names)
    names.add(1, "Babloo")
    println("After inserting new name")
    printListUsingIndices(names)

    // 2. ArrayList class can be used to create mutable list
    println("-----------ArrayList-------")
    val arrayList = ArrayList<String>()
    arrayList.add("Aman")
    arrayList.add("Raman")
    arrayList.add("Daman")
    arrayList.add("Kush")
    printListUsingForEachLoop(arrayList)

    // 3. arrayListOf() method can be used to create mutable list
    println("-----------ArrayList using arrayListOf() method-------")
    val arrayList1 = arrayListOf<String>()
    arrayList1.add("Aman")
    arrayList1.add("Raman")
    arrayList1.add("Daman")
    arrayList1.add("Kush")
    printListUsingForEachLoop(arrayList1)


}

fun printListUsingForEachLoop(list: List<String>) {
    for (s in list) {
        print("$s ")
    }
    println()
}

fun printListUsingIndices(list: List<String>) {
    for (element in list.indices) {
        println("Element at index $element is ${list[element]}")
    }
    println()
}
