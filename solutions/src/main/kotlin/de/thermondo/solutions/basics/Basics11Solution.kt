package de.thermondo.solutions.basics

/**
 * Print "Hello" five times using do-while loop.
 */

/*fun main() {
  hello()
}*/
@Suppress("MagicNumber")
fun hello() {
    var index = 1
    do {
        println("Hello!")
        index++
    } while (index <= 5)
}
