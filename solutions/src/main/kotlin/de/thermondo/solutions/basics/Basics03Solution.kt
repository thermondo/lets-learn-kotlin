package de.thermondo.solutions.basics

/**
 * You can pass parameters to functions first giving the parameter name and then the type:
 * parameterName : String
 *
 * Let's define a function called hello parameter that prints "Hello [passed value]!" to the console.
 * For example if we pass Kotlin as a parameter then the console output will be "Hello Kotlin!"
 *
 * Let's define a function with the following constraints:
 * function name : hello parameter
 *
 * @param value : String
 */
fun helloParameter(value: String) {
    println("Hello $value!")
}
