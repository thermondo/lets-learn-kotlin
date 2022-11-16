package de.thermondo.solutions.basics

/**
 *  When is an expression that returns a value.
 *  Let's define an enum class named Basics9Solution using "when" expression to print number for each month of the year.
*/

enum class Basics09Solutions() {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

fun main() {
    val year = Basics09Solutions.MAY
    when(year){ /**Here, "year" is an argument. The "when" expression matches its arguments against all branches
    in order until some branch condition is satisfied.*/
        Basics09Solutions.JANUARY -> println("1")
        Basics09Solutions.FEBRUARY -> println("2")
        Basics09Solutions.MARCH -> println("3")
        Basics09Solutions.APRIL -> println("4")
        Basics09Solutions.MAY-> println(5)
        Basics09Solutions.JUNE -> println("6")
        Basics09Solutions.JULY -> println("7")
        Basics09Solutions.AUGUST -> println("8")
        Basics09Solutions.SEPTEMBER -> println("9")
        Basics09Solutions.OCTOBER -> println("10")
        Basics09Solutions.NOVEMBER -> println("11")
        Basics09Solutions.DECEMBER -> println("12")
    }
    //println(Year.May)
}

