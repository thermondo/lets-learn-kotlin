package de.thermondo.solutions.basics

/**
 * Define kotlin exceptions with try-catch-finally.
 */
fun main() {
    tryCatchException()
}
@Suppress("MagicNumber")
fun tryCatchException(): Unit {
    val arr: IntArray = intArrayOf(1,2,3)
    try {
        println(arr[10])
    }
    catch (e: ArrayIndexOutOfBoundsException) {
        println("Please check the array index")
    }
    catch (e: NoSuchElementException) {
        println("Please check the array index")
    }
    finally {
        println("I am finally and I execute no matter what")
    }
}
