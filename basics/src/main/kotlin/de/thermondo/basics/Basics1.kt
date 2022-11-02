package de.thermondo.basics

/**
 * There are two ways of declaring variables in kotlin:
 * val (value) immutable
 * var (variable) mutable
 */

/**
 * Let's define an immutable variable with the following constraints:
 * name: immutableValue
 * value : 15
 */
fun main(){
    immutableValue()
    mutableValue()
}
fun immutableValue(){
    val name = "immutableValue"
    val immutableValue = 15
    println(name)
    println(immutableValue)
}
/**
 * Let's define a mutable variable with the following constraints:
 * name: mutableValue
 * value : 16
 */
fun mutableValue(){
    var name = "mutableValue"
    var mutableValue = 16
    println(name)
    println(mutableValue)
}
