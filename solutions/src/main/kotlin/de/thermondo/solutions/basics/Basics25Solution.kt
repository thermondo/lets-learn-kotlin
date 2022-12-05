package de.thermondo.solutions.basics

/*
*  Define a function to map the numbers with its equivalent string using maps.
*/

/* fun main() {
    destructuringDeclaration()
}*/

@Suppress("MagicNumber")
fun destructuringDeclaration() {
    val map = mapOf(1 to "One", 7 to "Seven", 53 to "Fifty-Three")
    for (key in map.keys) {
        println(map.get(key))
    }
}
