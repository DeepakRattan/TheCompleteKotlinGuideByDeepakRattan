package com.example.kotlin.oops.interfaces

/**
 * Created by Deepak Rattan on 15/5/20.
 * Topic : interface
 */

interface Interface1 {
    // By default properties are abstract
    val name: String

    // By default function without body are abstract
    fun f1()

    // Normal methods are public and open by default , not final
    fun show() {
        println("Interface1 : Show")
    }
}

interface Interface2 {

    // By default function without body are abstract
    fun f2()

    // Normal methods are public and open by default , not final
    fun show() {
        println("Interface2 : Show")
    }
}

class X : Interface1, Interface2 {
    override val name: String = "Class X"

    override fun f1() {
        println(" X : f1 called")
    }

    override fun f2() {
        println("X : f2 called")
    }

    override fun show() {
        super<Interface1>.show()
        super<Interface2>.show()
    }
}

fun main() {
    val x = X()
    println(x.name);
    x.f1()
    x.show()
}

