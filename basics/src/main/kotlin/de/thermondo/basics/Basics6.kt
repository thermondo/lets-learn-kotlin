package de.thermondo.basics

/**
 *
 * Take the reference of Basic5.kt and now let's create a class
 * which will return the data of two users by passing arguments.
 *
 */
fun main() {
    val user1 = User(name = "Tom", age = 32) // Values of the properties are referred as state. So Tom, 32 is the state of user1.
    println("User1 Name: ${user1.name}")
    println("User1 Age: ${user1.age}")

    val user2 = User(name = "Venelope", age = 28)//State of user2.
    println("User2 Name:${user2.name}")
    println("User2 Age:${user2.age}")

}
class User(name:String, age:Int){ //Here, name and age are the constructors.
                                  // Because we call it when we create an instance of the class.(line 10 & 14).
                                  // A constructor constructs an object and prepares to use.
    val name = name // The variables that are part of the class are called as properties.
    var age = age
}
