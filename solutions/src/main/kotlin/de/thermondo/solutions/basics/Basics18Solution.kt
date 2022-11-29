package de.thermondo.solutions.basics

/*
* Define a function with named arguments.
*/

/*
* fun main() {
    namedArgs(age = 32)
}
*/

fun namedArgs(name: String = "xyz", age: Int = 22): Any {
    println("My name is $name and I am $age years old")
    return "My name is $name and I am $age years old"
}
