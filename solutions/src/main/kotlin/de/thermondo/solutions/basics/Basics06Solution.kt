package de.thermondo.solutions.basics

/**
 * Create a class named Basics6Solution
 *
 * Define member variables:
 * name: String
 * age: Int
 * and return the data of the two people while writing unit tests.
 */
class Basics06Solution(name: String, age: Int) {
    //Here, name and age are the constructors.
    // Because we call it when we create an instance of the class.(line 10 & 14).
    // A constructor constructs an object and prepares to use.
    val name = name // The variables that are part of the class are called as properties.
    var age = age
}

