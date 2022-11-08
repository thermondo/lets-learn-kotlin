package de.thermondo.basics

/**
 *
 * try-throw
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
