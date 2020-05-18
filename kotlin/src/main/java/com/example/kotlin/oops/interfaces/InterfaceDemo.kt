package com.example.kotlin.oops.interfaces

/**
 * Created by Deepak Rattan on 14/5/20.
 * Topic : Interface
 */

interface MyInterface {
    // Properties are abstract by default
    var name: String

    // function without body are abstract by default
    fun onTouch()

    // Normal methods are public and open by default ,not final
    fun onClick() {
        println("onClick Interface")
    }
}

class MyClass : MyInterface {
    override var name: String = "Test"
    override fun onTouch() {
        println("On touch")
    }

    override fun onClick() {
        super.onClick()
        println("Onclick Class")
    }

}


interface Clickable {
    // Functions without body are abstract by default
    fun click()

    // Normal methods are public and open by default ,not final
    fun show() = println("Show")
}

interface Focusable {
    fun show() = println("Show")
}

class Button : Clickable, Focusable {
    override fun click() {
        println("On clicked")
    }

    override fun show() {
        super<Clickable>.show()
        super<Focusable>.show()
    }
}

fun main() {
    //val b = Button()
    //b.click()
    //b.show()

    val c = MyClass()
    c.onTouch()
    c.onClick()

}




