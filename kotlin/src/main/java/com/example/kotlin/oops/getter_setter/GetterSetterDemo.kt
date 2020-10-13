package com.example.kotlin.oops.getter_setter

class Person {
    var name: String = "default value"
        // In Kotlin, getters and setters are optional and are auto-generated if you do not create them in your program.
        //getter
        get() = field
        //setter
        set(value) {
            field = value
        }
}

fun main(){
    val p = Person()
    p.name = "Kotlin"
    println("Name is ${p.name}")
}