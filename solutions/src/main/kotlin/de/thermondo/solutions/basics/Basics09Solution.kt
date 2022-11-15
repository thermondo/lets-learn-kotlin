package de.thermondo.solutions.basics

/**
 *  When is an expression that returns a value.
 *  Let's define an enum class named Basics9Solution using "when" expression to print number for each month of the year.
*/

enum class Basics9Solutions() {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}

fun main() {
    val year = Basics9Solutions.May
    when(year){ /**Here, "year" is an argument. The "when" expression matches its arguments against all branches
    in order until some branch condition is satisfied.*/
        Basics9Solutions.January -> println("1")
        Basics9Solutions.February -> println("2")
        Basics9Solutions.March -> println("3")
        Basics9Solutions.April -> println("4")
        Basics9Solutions.May -> println("5")
        Basics9Solutions.June -> println("6")
        Basics9Solutions.July -> println("7")
        Basics9Solutions.August -> println("8")
        Basics9Solutions.September -> println("9")
        Basics9Solutions.October -> println("10")
        Basics9Solutions.November -> println("11")
        Basics9Solutions.December -> println("12")
    }
    //println(Year.May)
}

