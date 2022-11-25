package de.thermondo.solutions.basics

/**
 * Define kotlin exceptions with try-catch-finally.
 */
fun main() {
    tryCatchException()
}
fun tryCatchException(): String {
    var arr: Array<Int> = arrayOf(1,2,3)
    try {
        println(arr[10])
    }

    catch (e: Exception) {
       var x =  println("Please check the array index")
    }
    finally {
        var y =println("I am finally and I execute no matter what")
       // return x + y
    }
  return "Please check the array index\nI am finally and I execute no matter what"

}
