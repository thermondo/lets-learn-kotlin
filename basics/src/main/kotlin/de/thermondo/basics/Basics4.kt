package de.thermondo.basics

/**
 * Functions can also return values by defining a return type.
 * For example a function that returns a String can be defined as such:
 *
 * fun functionWithReturnType() : String
 *
 * Let's define a function called add, that adds two numbers together
 * and returns their value:
 *
 * @param valueOne: Int
 * @param valueTwo: Int
 * @return Int
 */

fun main(){
   println(add(5,10))
}
fun add(v1:Int, v2:Int): Int =
    v1+v2
