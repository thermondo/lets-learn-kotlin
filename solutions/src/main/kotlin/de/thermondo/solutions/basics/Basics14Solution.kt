package de.thermondo.solutions.basics

/**
 * Define a function to throw an exception when the count goes below zero.
 */

fun main() {
    count(5)
    count(-1)
}
fun count(count:Int){
    if(count<0){
        throw IllegalArgumentException("Count has to be greater than 0")
    }
    else{
        println("List has $count users in it")
    }
}
