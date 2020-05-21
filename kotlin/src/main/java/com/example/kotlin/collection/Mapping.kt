package com.example.kotlin.collection

/**
 * Created by Deepak Rattan on 21/5/20.
 * Topic : Mapping
 *        1. map()
 *        2. mapIndexed()
 * Description :
 *          1. The Kotlin standard library provides a set of extension functions
 *          for collection transformations. These functions build new collections from
 *          existing ones based on the transformation rules provided.
 *
 *          2. The mapping transformation creates a collection from the results of a
 *          function on the elements of another collection.
 *
 *          3. The basic mapping function is map(). It applies the given lambda function
 *          to each subsequent element and returns the list of the lambda results.
 *          The order of results is the same as the original order of elements.
 */

fun main() {
    // 1. map() function
    val numbers = listOf<Int>(0, 1, 2, 3, 4, 5)
    println(numbers)

    println("---------1. map() function------------------")
    val squaredNumbers = numbers.map { num -> num * num }
    println(squaredNumbers)

    // 2. mapIndexed() function
    // To apply a transformation that additionally uses the element index as an argument .
    println("---------2. mapIndexed() function-------------------")
    val res = numbers.mapIndexed { index, i -> index * i }
    println(res)

    // If the transformation produces null on certain elements, you can filter out the nulls
    // from the result collection by calling the mapNotNull() function instead of map(),
    // or mapIndexedNotNull() instead of mapIndexed().

    //3. mapNotNull()
    println("---------3. mapNotNull() function---------------------")
    val res1 = numbers.mapNotNull { num -> if (num == 0) null else num * num }
    println(res1)

    //4. mapIndexedNotNull()
    println("---------1. mapIndexedNotNull() function----------------")
    val res2 = numbers.mapIndexedNotNull { index, i -> if (index == 0) null else index * i }
    println(res2)


    // Filtering and mapping
    println("------------------Filtering and mapping------------------------------")
    val data = listOf<Int>(1, 2, 3, 4, 5)
    println("data : $data")
    // get the square of each element of  data where data < 4
    val squaredNumber = data.filter { n -> n < 4 }
        .map { n -> n * n }
    println("Squared Number : $squaredNumber")

    val students = listOf<Student>(Student("DR", 30), Student("Deepak", 28), Student("Rajat", 10))
    println(students)
    // Getting names from student list
    val studentNames = students.map { s -> s.name }
    println(studentNames)
    // Getting those names which start with D only from student list
    val studentNames1 = students.filter { s -> s.name.startsWith("D") }
                                .map { s -> s.name }
    println(studentNames1)


}

class Student(var name: String, var age: Int) {
    override fun toString(): String {
        return "$name $age"
    }
}

