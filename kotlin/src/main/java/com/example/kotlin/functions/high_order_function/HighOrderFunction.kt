package com.example.kotlin.functions.high_order_function

/**
 * Created by Deepak Rattan on 19/5/20.
 * Topic : High Order Function and Lambda
 */
fun main() {
    val t = Test()
    t.add(10, 20)
    t.add(10, 20, object : MyInterface {
        override fun execute(sum: Int) {
            println("Using Interfaces : Sum = $sum")
        }

    })

    // 1. Lambda Expression is a function without name
    // 2. A lambda expression in Kotlin is always surrounded by curly braces.
    // e.g. { sum: Int -> println("Sum using Lambda Expression = $sum") }
    // 3. Note that there are no parentheses around the arguments.
    // The arrow separates the argument list from the body of the lambda.
    // 4. We are having arguments to the LHS of arrow -> and body to the RHS of it in a lambda expression
    // 5. You can store a lambda expression in a variable and then treat this variable like a
    // normal function (call it with the corresponding arguments)

    val myLambda: (Int) -> Unit =
        { sum: Int -> println("Using Lambda Expression : Sum = $sum") }

    t.add(10, 20, myLambda)
    // Directly passing lambda expression to add function
    t.add(10, 20) { sum: Int -> println("Using Lambda Expression : Sum = $sum") }
    // Lambda Expression with 3 integer parameter and returning integer value
    val myLambda1: (Int, Int, Int) -> Int = { x, y, z -> x + y + z }

    // Different way to pass lambda expression to high order function
    // 1. First way - Passing variable to high order function
    t.add(10, 20, 30, myLambda1)
    // 2. Second way - Passing lambda expression directly
    t.add(10, 20, 30, { x, y, z -> x + y + z })
    // 3. Third way - Passing Lambda expression outside the parenthesis
    t.add(10, 20, 30) { x, y, z -> x + y + z }

    // Kotlin Closures
    // Closures are functions that can access and modify properties defined outside the scope of the function.
    // A lambda expression or anonymous function (as well as a local function and an object expression)
    // can access its closure, i.e. the variables declared in the outer scope.
    // The variables captured in the closure can be modified in the lambda .
    var result = 0.0
    // Using Lambda expression ,we can the property defined outside the scope of lambda
    // e.g. using following lambda,we will change the result variable
    val myLambda2: (Double, Double) -> Unit = { x, y -> result = x + y }
    t.add(10.0, 20.0, myLambda2)
    println("Result = $result")


}

class Test {
    // Normal Function
    fun add(a: Int, b: Int) {
        val sum = a + b
        println("Using Normal Function : Sum = $sum")
    }

    // Using Interfaces
    fun add(a: Int, b: Int, action: MyInterface) {
        val sum = a + b
        action.execute(sum)
    }

    // High order function With Lambda as a parameter
    fun add(a: Int, b: Int, myLambda: (Int) -> Unit) {
        val sum = a + b
        myLambda(sum)
    }

    //High order function with lambda as a parameter
    fun add(a: Int, b: Int, c: Int, myLambda1: (Int, Int, Int) -> Int) {
        val res = myLambda1(a, b, c) // x+y+z = a+b+c = 60
        println("Sum : $res")
    }


    fun add(a: Double, b: Double, myLambda2: (Double, Double) -> Unit) {
        myLambda2(a, b)
    }

}

interface MyInterface {
    fun execute(sum: Int)
}