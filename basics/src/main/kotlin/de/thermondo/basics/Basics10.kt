package de.thermondo.basics

/**
 *
 *
 */

fun main() {

}
fun doubleTheValue(obj: Any): Any =
    when (obj) {
        is String -> obj.repeat(2)
        is Long -> obj * 2
        is List<*> -> obj + obj
        else -> "Unsupported Type Found."
    }
