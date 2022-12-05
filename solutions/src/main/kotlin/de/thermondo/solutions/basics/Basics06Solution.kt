package de.thermondo.solutions.basics

/*
 * You can pass parameters to classes via the class constructor by first giving the parameter name
 * and then the type, similar to how we create functions with parameters.
 *
 * Let's create a class called Basics06Solution,
 * Define member variables:
 * @param userName: String
 * @param userAge: Int
 * and assign these member variables the parameter values.
 */

class Basics06Solution(name: String, age: Int) {
    val userName = name
    val userAge = age
}
