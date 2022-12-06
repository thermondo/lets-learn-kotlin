package de.thermondo.solutions.basics

/*
 * You can pass parameters to classes via the class constructor by first giving the parameter name
 * and then the type, similar to how we create functions with parameters.
 *
 * Let's create a class called Basics06, that accepts the following parameters:
 * @param name: String
 * @param age: Int
 *
 * Define member variables:
 * userName: String
 * userAge: Int
 * and assign these member variables the parameter values.
 */

class Basics06Solution(name: String, age: Int) {
    val userName = name
    val userAge = age
}
