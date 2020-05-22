package com.example.kotlin.lazy_initialization

/**
 * Created by Deepak Rattan on 22/5/20.
 * Topic : Lazy Initialization
 * Description :
 *             1. Lazy initialization is done to prevent unnecessary initialization of objects
 *             2. The variable will not be initialized unless we use it in our code.
 *             3. It is initialized only once . Next time when we use it ,the value is received from
 *             cache memory .
 *             4. Lazy initialization is thread safe
 *                  - It is initialized in the thread where it is used for the first time .
 *                  - Other threads will use the same value stored in cache
 *             5. The variable can be var or val
 *             6. The variable can be nullable or non nullable
 */

// val pi: Double = 3.14
/* Even if we do not use the variable pi in main function ,still the memory will be allocated to pi
and that is the wastage of memory .To solve this issue ,lazy initialization comes into play */

//Lazy initialization
// If we don't use pi in main function ,memory will not allocated to it as we are lazily initializing
// our variable i.e variable will not be initialized unless we use it .
val pi: Double by lazy {
    3.14
}

fun main() {
    println("--------------")
    // Now the pi will be initialized as we are accessing it i.e the effective utilization of memory.
    // Once we use the variable first time ,the value is stored in cache memory
    val area1 = pi * 2 * 2
    // This time pi will not be initialized again,the value of pi will be retrieved from cache
    val area2 = pi * 2 * 2
}

