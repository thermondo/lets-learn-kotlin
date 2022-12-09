package de.thermondo.solutions.basics

fun regularExpression(): Boolean {
    val str: String = "Kotlin"
    val pattern = Regex("tl")
    return pattern.containsMatchIn(str)
}
