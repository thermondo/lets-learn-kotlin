package de.thermondo.basics

/**
 *
 *
 */

fun main() {
    println("Normal incrementing:")
    increment()
    println("Incrementing with 2 steps:")
    stepIncrement()
    println("Increment excluding upper bound:")
    untilIncrement()
    println("Decrement with 2 steps")
    stepDecrement()
}

/**
 * Let us define a function that prints the values in the incremental order.
 */
fun increment(){
    for (i in 1..5){
        println(i)
    }
}

/**
 * Let us define a function that return the alternate values.
 */
fun stepIncrement(){

    for (i in 1..5 step 2){
        println(i)
    }
}

/**
 * Let us define a function that returns values in the incremented order but excluding the upper bound.
 */
fun untilIncrement(){
    for (i in 1 until 5){
        println(i)
    }
}

/**
 * Let us define a function that returns values with two steps.
 */
fun stepDecrement(){
    for (i in 10 downTo 1 step 2){
        println(i)
    }
}
