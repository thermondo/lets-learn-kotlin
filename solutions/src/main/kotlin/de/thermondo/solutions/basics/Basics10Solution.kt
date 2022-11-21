package de.thermondo.solutions.basics
import com.sun.tools.javac.Main
/**
 * Print the table of 2 using while loop.
 */

fun tableOf2() {
    var num = 2
    var index = 1
    while (index <= 10)
    {
        println(num*index)
        index++
    }
    //print("Current Index : "+index)
}


/*fun whileLoop(index:Int) :Int{
    var num = 2
    //var index = 1
    while (index <= 10)
    {
        println(num*index)
        index++
    }
    //print("Current Index : "+index)
}*/
