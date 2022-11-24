package de.thermondo.solutions.basics

/**
 *  When is an expression that returns a value.
 *  Let's define an enum class named Basics9Solution using "when" expression to print number for each month of the year.
 */

enum class Basics09Solution {
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
    DECEMBER;
}

@Suppress("MagicNumber")
fun enumMonths(): Int {
    var year = Basics09Solution.MARCH
    var monthNumber: Int

    when (year) {
        Basics09Solution.JANUARY -> monthNumber = 1
        Basics09Solution.FEBRUARY -> monthNumber = 2
        Basics09Solution.MARCH -> monthNumber = 3
        Basics09Solution.APRIL -> monthNumber = 4
        Basics09Solution.MAY -> monthNumber = 5
        Basics09Solution.JUNE -> monthNumber = 6
        Basics09Solution.JULY -> monthNumber = 7
        Basics09Solution.AUGUST -> monthNumber = 8
        Basics09Solution.SEPTEMBER -> monthNumber = 9
        Basics09Solution.OCTOBER -> monthNumber = 10
        Basics09Solution.NOVEMBER -> monthNumber = 11
        Basics09Solution.DECEMBER -> monthNumber = 12
        else -> {
            monthNumber = -1
        }
    }
    return monthNumber
    // println(Basics09Solutions.MAY)
}

fun main() {
    enumMonths()
}
