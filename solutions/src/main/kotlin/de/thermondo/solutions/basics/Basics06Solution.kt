package de.thermondo.solutions.basics

/**
 * Create a class named Basics6Solution
 *
 * Define member variables:
 * name: String
 * age: Int
 * and return the data of the two people while writing unit tests.
 */
class Basics06Solution (name:String, age:Int){
    //Here, name and age are the constructors.
    // Because we call it when we create an instance of the class.(line 10 & 14).
    // A constructor constructs an object and prepares to use.
    val name = name // The variables that are part of the class are called as properties.
    var age = age
}

/*
fun main() {
    val user1 = Basics6Solution(name = "Tom", age = 32) // Values of the properties are referred as state. So Tom, 32 is the state of user1.
    println("User1 Name: ${user1.name}")
    println("User1 Age: ${user1.age}")

    val user2 = Basics6Solution(name = "Venelope", age = 28)//State of user2.
    println("User2 Name:${user2.name}")
    println("User2 Age:${user2.age}")

}*/
