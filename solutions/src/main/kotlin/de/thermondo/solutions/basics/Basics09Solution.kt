package de.thermondo.solutions.basics

/**
 *  When is an expression that returns a value.
 *  Let's define an enum class named Basics9Solution using "when" expression to print number for each month of the year.
 */
enum class Basics09Solution {
    // JANUARY, // FEBRUARY,
    MARCH;
    // APRIL,
    // MAY,
    // JUNE,
    // JULY,
    // AUGUST,
    // SEPTEMBER,
    // OCTOBER,
    // NOVEMBER,
    // DECEMBER;

    @Suppress("MagicNumber")
    fun enumMonths(): Int {
        var year = MARCH
        // var year4 = APRIL
        var monthNumber: Int

        /* when (year3) {
             MARCH -> monthNumber = 3
             else -> {
                 monthNumber = -1
             }
         } */
        /* when (year4) {
             APRIL -> monthNumber = 4
             else -> {
                 monthNumber = -1
             }
         } */
        when (year) {
            // JANUARY -> monthNumber = 1
            // FEBRUARY -> monthNumber = 2
            MARCH -> monthNumber = 3
            /* APRIL -> monthNumber = 4
             MAY -> monthNumber = 5
             JUNE -> monthNumber = 6
             JULY -> monthNumber = 7
             AUGUST -> monthNumber = 8
             SEPTEMBER -> monthNumber = 9
             OCTOBER -> monthNumber = 10
             NOVEMBER -> monthNumber = 11
             DECEMBER -> monthNumber = 12 */
            else -> {
                monthNumber = -1
            }
        }
        return monthNumber
        // println(Basics09Solutions.MAY)
    }
}
/*
fun main() {
    enumMonths()
} */
