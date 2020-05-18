package com.example.kotlin.oops.data_class

/**
 * Created by Deepak Rattan on 16/5/20.
 * Topic : Data class
 */

fun main() {
    val s1 = Student("Vijay", 26)
    val s2 = Student("Vijay", 26)

    println("s1= $s1")

    if (s1.equals(s2)) {
        println("Equal")
    } else {
        println("Not equal")
    }

    // create copy of s1
    val s3 = s1.copy()
    println("s3 = $s3")

    val s4 = s1.copy(name = "Ajay")
    println("s4 = $s4")

    println("hashcode : ${s4.hashCode()}")
    println("hashcode : ${s4.hashCode()}")
    println("hashcode : ${s4.hashCode()}")

    println("---------------------")
    val p1 = Person("Abhi", 30)
    val p2 = Person("Abhi", 30)

    val res = if (p1 == p2) "Equal" else "Not Equal"
    println("Normal class : Is ( p1 == p2 )? $res")

    val res1 = if (s1 == s2) "Equal" else "Not Equal"
    println("Data class : Is ( s1 == s2 )? $res1")

    println("Normal class : p1: hashcode = ${p1.hashCode()}")
    println("Normal class : p2: hashcode = ${p2.hashCode()}")

    println("Data class : s1: hashcode = ${s1.hashCode()}")
    println("Data class : s2: hashcode = ${s2.hashCode()}")

    val res3 = if (p1.equals(p2)) "Equal" else "Not Equal"
    println("Normal class : Is ( p1.equals(p2) )? $res3")

    val res4 = if (s1.equals(s2)) "Equal" else "Not Equal"
    println("Data class : Is ( s1.equals(s2) )? $res4")

    // Destructuring Declaration
    println("Destructuring Declaration")
    val (name, age) = s1
    println(name)
    println(age)

    val comp1 = s1.component1()
    println("Component1 = $comp1")

}

class Person(name: String, age: Int)

data class Student(var name: String, var age: Int) {

}