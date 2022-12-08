package de.thermondo.solutions.basics

fun main() {
    regularExpression()
}

fun regularExpression(): Any {
    val str: String = "Kotlin"
    val pattern = Regex("tl")
    val result = pattern.containsMatchIn(str)
    //println(result)
    return result
}
