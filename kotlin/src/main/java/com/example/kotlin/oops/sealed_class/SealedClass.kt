package com.example.kotlin.oops.sealed_class

import java.lang.Exception

/**
 * Created by Deepak Rattan on 18/5/20.
 * Topic : Kotlin Sealed Classes
 * Description :
 * 1. Let’s understand the concept of Sealed classes by understanding its difference from
    the Enum classes with a use case. Let’s take a Result and let’s say there are only
    two types of Results: Success and Error.

    So, Enum classes are helpful, but they have their limitations. For example,
    each subtype of the Enum class can be only a constant and it has no state.
    That is, what if instead of just one hardcoded "Error", there are different
    dynamic error messages(the states of the objects), it is not possible using Enum.
    Also, we cannot have different types of subclasses involved, which can be done
    with Sealed classes .

 * 2. Sealed classes give us the flexibility of having different types of
 * subclasses and also containing the state.
 *
 * 3. Sealed classes are abstract by itself, and cannot be instantiated directly.
 *
 * 4. If Sealed classes are abstract by default, why can’t we use an abstract class
 * instead of a sealed class in the first place? Well, the catch here is an abstract
 * class can have their hierarchies anywhere in the project, whereas a sealed class
 * should contain all the hierarchies in the same file.
 */

fun main() {
    println("---------enum class------------------")
    val s = Result.SUCCESS
    evalEnumClass(s)

    val err = Result.ERROR
    evalEnumClass(err)

    println("---------Sealed class------------------")
    val success = Result1.Success(Data(100, "Success With Sealed class"))
    evalSealedClass(success)
    val er = Result1.Error(Exception("Exception caught"))
    evalSealedClass(er)
}

enum class Result(val data: String) {
    SUCCESS("Success"),
    ERROR("Error")
    //ERROR(val exception: Exception) // not possible with enums
}

// Here, we have a data class success object which contains the success Data
// and a data class Error object which contains the state of the error.
sealed class Result1 {
    data class Success(val data: Data) : Result1()
    data class Error(val exception: Exception) : Result1()
}

class Data(code: Int, message: String) {
    private var code: Int = -1
    private var message: String = ""

    init {
        this.code = code
        this.message = message
    }

}

// function for evaluating enum class Result
fun evalEnumClass(r: Result) {
    when (r) {
        Result.SUCCESS -> println("Success with Enum")
        Result.ERROR -> println("Error With Enum")
    }
}

// function for evaluating Sealed class Result1
fun evalSealedClass(res: Result1) {
    when (res) {
        is Result1.Success -> println("Success")
        is Result1.Error -> println("Failure")
    }
}