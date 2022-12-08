package de.thermondo.solutions.basics

/*
* String can be split by using the split extension function which takes an arbitrary number
* of delimiters as plain-text strings.
* Let's create a function which splits the string using split().
*/

fun splitFun() {
    println("12.345-6.A".split(".", "-"))
}
