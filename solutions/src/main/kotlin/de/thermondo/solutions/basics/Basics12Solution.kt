package de.thermondo.solutions.basics

/**
 * Define the following functions:
 *
 * A function that prints the values in the incremental order.
 *
 * A function that return the alternate values.
 *
 * A function that returns values in the incremented order but excluding the upper bound.
 *
 * A function that returns values with two steps.
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

//Function to print the values in the incremental order.
fun increment(){
    for (i in 1..5){
        println(i)
    }
}

//Function that return the alternate values.
fun stepIncrement(){

    for (i in 1..5 step 2){
        println(i)
    }
}


//Function that returns values in the incremented order but excluding the upper bound.
fun untilIncrement(){
    for (i in 1 until 5){
        println(i)
    }
}

//Function that returns values with two steps.
fun stepDecrement(){
    for (i in 10 downTo 1 step 2){
        println(i)
    }
}
