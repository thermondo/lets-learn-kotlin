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
    DECEMBER;
}

fun enumMonths(): Int {

    var year = Basics09Solutions.MARCH
    when(year){ /**Here, "year" is an argument. The "when" expression matches its arguments against all branches
    in order until some branch condition is satisfied.*/
        Basics09Solutions.JANUARY -> return 1
        Basics09Solutions.FEBRUARY -> return 2
        Basics09Solutions.MARCH -> return 3
        Basics09Solutions.APRIL -> return 4
        Basics09Solutions.MAY-> return 5
        Basics09Solutions.JUNE -> return 6
        Basics09Solutions.JULY -> return 7
        Basics09Solutions.AUGUST -> return 8
        Basics09Solutions.SEPTEMBER -> return 9
        Basics09Solutions.OCTOBER -> return 10
        Basics09Solutions.NOVEMBER -> return 11
        Basics09Solutions.DECEMBER -> return 12
    }
    return -1
   // println(Basics09Solutions.MAY)
}
fun main() {
    enumMonths()
}
