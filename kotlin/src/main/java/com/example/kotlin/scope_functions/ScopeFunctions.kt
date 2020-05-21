package com.example.kotlin.scope_functions

/**
 * Created by Deepak Rattan on 19/5/20.
 * Topic : Scope Functions- let ,run ,with ,apply ,also
 */

fun main() {
    //let
    letDemo()
    letDemo1()
    //run
    runDemo()
    //with
    withDemo()
    //run vs with
    //runVsWith()
    performRunOperation()
    performWithOperation()
    //apply
    //applyDemo()
    //alsoDemo()
}

/* In Kotlin, if the last statement in a “let” block is a non-assignment statement,
it is by default a return statement.*/

// let refers to the context of the object by using the “it” keyword

/* From the below code snippet, we can see that although “let” operation is performed
on a Person object, the output of the code is a string value and not the Person object.
This implies that the “let” operator provides an option to perform an operation on the
current object and return any value based on the use case.*/

fun letDemo() {
    val person = Person("Deepak", 30).let {
        // 1. “let” operation is performed on a Person object,
        // 2. the output of the code is a string value and not the Person object.
        // 3. This implies that the “let” operator provides an option to perform an
        // operation on the current object and return any value based on the use case
        // 4. It is not necessary to write “return@let”. This is only done to enhance code readability.
        // 5. In Kotlin, if the last statement in a “let” block is a non-assignment statement,
        // it is by default a return statement.
        return@let "let : The name of person is ${it.name}"
    }
    println(person)
}

// “let” can also be used when we want to perform an operation on the result of a call chain.
fun letDemo1() {
    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five")
    // print the length of numbers where length of each element > 3
    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
    }

}

/* 1. The “run” operator is similar to the “let” operator in terms of accepting a return value
 that is different from the object on which the scope function is being applied to. Hence, a
 “run” operator can be used to initialize an object and return the result of it. */

/* 2. run refers to the context of the object as “this” and not “it”*/

fun runDemo() {
    val p = Person("DR", 30).run {
        this.name = "Deepak"
        //return@run this
        return@run "Run : The name of the person is ${this.name}"
    }
    println(p)
}

//3. with
fun withDemo() {
    val res = with(Person("DR", 30)) {
        this.name = "Deepak"
        return@with "with : Person's name is ${this.name}"
    }
    println(res)
}

// run vs with

fun performRunOperation() {
    //Person object is nullable
    val student: Student? = null
    println("----------run----------- ")
    val s = student?.run {
        this.name = "Deepak"
        this.age = 30
        //this.display()
        return@run "return a string instead of Student object"
    }
    println(s)

}

fun performWithOperation() {
    //Person object is nullable
    val student: Student? = null
    val s = with(student) {
        this?.name = "DR"
        this?.age = 30
        return@with "Name is ${this?.name}"
    }

    println(s)
}

fun runVsWith() {
    //Person object is nullable
    val student: Student? = null
    println("----------run----------- ")
    val s = student?.run {
        this.name = "Deepak"
        this.age = 30
        this.display()
        return@run "return a string instead of Student object"
    }
    println("s = $s")


    println("------with------------")
    with(student) {
        this?.name = "DR"
        this?.age = 30
        this?.display()
    }

}

fun applyDemo() {
    val p = Person("DR", 30)
    p.apply {
        this.name = "Deepak"
    }
    println("apply : Person is $p")
}

fun alsoDemo() {
    val p = Person("DR", 30)
    p.also {
        it.name = "Deepak Rattan"
    }
    println("also : Person is $p")
}


class Person(name: String, age: Int) {
    var name = ""
    var age = 0

    init {
        this.name = name
        this.age = age
    }

    override fun toString(): String {
        return "$name $age"
    }

}

class Student {
    var name: String = "Raj"
    var age: Int = 30

    fun display() {
        println("name = $name and age = $age")
    }

}