@file:JvmName("MyCustomKotlin")

package com.example.kotlin.interoperability

/**
 * Created by Deepak Rattan on 12/5/20.
 *
 * Topic : Java Interoperability
 *
 * Definition : Kotlin code is fully compatible with Java code.
 * The existing Java code can be easily called form Kotlin code and
 * Kotlin code is also called from Java code in normal way.
 *
 * Description of code : Inside the interoperability package ,we have one kotlin file
 * named MyKotlinDemo.kt and on one Java class named MyJavaDemo .Please refer to both
 * for understanding interoperability
 */

fun main() {
    //Accessing Java code from kotlin
    MyJavaDemo.showJava()
}

fun showKotlin() = println("Kotlin Code")

//function with default arguments
// @JvmOverloads indicates that this function is accessible to Java file
@JvmOverloads
fun area(length: Int, breadth: Int = 10) = println(length * breadth)