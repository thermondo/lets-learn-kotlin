package de.thermondo.solutions.basics

/**
 * Define kotlin exceptions with try-catch-finally.
 */

fun main() {
    var arr: Array<Int> = arrayOf(1,2,3)
    try {
        println(arr[10])
    }

    catch (e: Exception){
        println("Please check the array index")
    }
    finally {
        println("I am finally and I execute no matter what")
    }
}
