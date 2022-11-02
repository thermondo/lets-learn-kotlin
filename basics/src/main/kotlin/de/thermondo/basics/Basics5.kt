package de.thermondo.basics

/**
 *
 *
 * Define a class with person's name and age in it.
 * And print the values of the class properties by creating the class object.
 *
 */
fun main() {
    val person = Person()    // Created object of the Person class. This person object is also called as an instance of the Person class.
                             // The process of creating the object is called instantiation.

    println("Name:${person.name}")
    println("Age:${person.age}")

}
class Person {
    val name = "Florian"
    var age = 26
}
