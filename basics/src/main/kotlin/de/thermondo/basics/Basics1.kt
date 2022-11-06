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
fun immutableValue(): Int {
    //val name = "immutableValue"
    val immutableValue = 15
    return immutableValue
   // println(name)
   // println(immutableValue)
}
/**
 * Let's define a mutable variable with the following constraints:
 * name: mutableValue
 * value : 16
 */
fun mutableValue(): Int {
   // var name = "mutableValue"
    var mutableValue = 16
    return mutableValue
    //println(name)
    //println(mutableValue)
}
