package de.thermondo.solutions.basics

/*
* Define a function using default arguments.
*/

/*
* fun main() {
    defaultArgs(name = "Mike Ross", age = 28, likesMovies = false)
}
* */

fun defaultArgs(name: String, age: Int, likesMovies: Boolean = true, lovesPopcorn: Boolean = true): Any {
    println("My name is $name, I am $age years old, Likes Movies: $likesMovies, Loves Popcorn: $lovesPopcorn")
    return "My name is $name, I am $age years old, Likes Movies: $likesMovies, Loves Popcorn: $lovesPopcorn"
}
