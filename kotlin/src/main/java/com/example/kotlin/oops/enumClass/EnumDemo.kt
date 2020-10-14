package com.example.kotlin.oops.enumClass

/**
 * Created by Deepak Rattan on 18/5/20.
 * Topic : enum
 *
 * Description :
 * 1. In programming, sometimes there arises a need for a type to have only
 * certain values. To accomplish this, the concept of enumeration was introduced.
 * Enumeration is a named list of constants.
 *
 * 2. In Kotlin, like many other programming languages, an enum has its own
 * specialized type, indicating that something has a number of possible values.
 * Unlike Java enums, Kotlin enums are classes.
 *
 * 3. Each of the enum constants acts as separate instances of the class
 * and separated by commas.
 *
 * 4. An instance of enum class cannot be created using constructors.
 */

fun main() {
    for (day in Days.values()) {
        println("${day.ordinal} = ${day.name}")
    }
    println("----------------------------------")
    println(Card.Diamond.color)

    println("-------Use of when expression with enum class------------")
    // A great advantage of enum classes in Kotlin comes into play when they are combined
    // with the when expression. The advantage is since enum classes restrict the value a
    // type can take, so when used with the when expression and the definition for all the
    // constants are provided, then the need of the else clause is completely eliminated.
    // In fact, doing so will generate a warning from the compiler.

    when (Days.SUNDAY) {
        Days.SUNDAY -> println("Today is Sunday")
        Days.MONDAY -> println("Today is Monday")
        Days.TUESDAY -> println("Today is Tuesday")
        Days.WEDNESDAY -> println("Today is Wednesday")
        Days.THURSDAY -> println("Today is Thursday")
        Days.FRIDAY -> println("Today is Friday")
        Days.SATURDAY -> println("Today is Saturday")
    }

    when (Card.Diamond) {
        Card.Diamond -> println("Diamond")
        Card.Heart -> println("Heart")
    }

}

// Since enum constants are instances of an Enum class, the constants
// can be initialized by passing specific values to the primary constructor.

enum class Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum class Card(val color: String) {
    Diamond("Black"),
    Heart("Red")
}

