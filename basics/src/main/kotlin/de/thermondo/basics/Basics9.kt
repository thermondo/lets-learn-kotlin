package de.thermondo.basics

/**
 *
 *  When is an expression that returns a value.
 *  Let's define an enum class using "when" expression to print number for each month of the year.
 */

fun main() {
    val year = Year.May
    when(year){ /**Here, "year" is an argument. The "when" expression matches its arguments against all branches
                in order until some branch condition is satisfied.*/
        Year.January -> println("1")
        Year.February -> println("2")
        Year.March -> println("3")
        Year.April -> println("4")
        Year.May -> println("5")
        Year.June -> println("6")
        Year.July -> println("7")
        Year.August -> println("8")
        Year.September -> println("9")
        Year.October -> println("10")
        Year.November -> println("11")
        Year.December -> println("12")
    }
    //println(Year.May)
}
enum class Year(){
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
