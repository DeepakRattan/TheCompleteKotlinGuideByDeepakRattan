package com.example.kotlin.null_safety_operator

/**
 * Created by Deepak Rattan on 22/5/20.
 * Topic : Null Safety in Kotlin
 *        1. Safe Call Operator (?.)
 *        2. Safe call with let (?.let{})
 *        3. Elvis Operator (?:)
 *        4. Non Null Assertion (!!)
 *
 * Description: Kotlin’s type system is aimed to eliminate the problem of null reference from the
 * code because it is a billion dollar mistake. NullPointerExceptions are thrown by
 * the program at runtime and sometimes cause application failure or system crashes.
 * Kotlin compiler also throws NullPointerException if it found any null reference
 * without executing any other statements.
 */

fun main() {
    // name is nullable variable
    // To allow a variable to hold null, we can declare a variable as nullable string,
    // written String?
    val name: String? = null

    // 1. Safe call operator(?.)
    // Returns the name if not null else returns null
    // Use it if we need not to bother about null values
    println("-----------------Safe call-------------------")
    println("Name is $name")
    println("Length of name is ${name?.length}")
    println("--------------------------------------------------------")

    // 2. Safe call with let
    // It will execute the let block only if name is not null
    println("-----------------Safe call with let-------------------")
    name?.let {
        println("Name is $name") // This statement will not be executed as name is null
        println("Length of name is ${name.length}")
    }
    println("--------------------------------------------------------")

    // 3.Elvis operator (?:)
    // When we need to return different value other than null for a nullable reference,use it
    println("-----------------Elvis Operator-------------------")
    println("Name is ${name ?: "Default"}") // As name is nullable ,so it will print "Default"
    println("Length of name is ${name?.length ?: -1}")
    println("--------------------------------------------------------")

    // 4. Non-Null Assertion operator (!!)
    // Use it when we are 100% sure that the value is not null,otherwise NPE will be thrown
    println("-----------------Non null assertion operator-------------------")
    println("Name is ${name!!}")
    println("Length of name is ${name!!.length}")
    println("--------------------------------------------------------")


}