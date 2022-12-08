package de.thermondo.solutions.basics

fun main() {
    tripleQuoted()
}
 fun tripleQuoted(){

     val kotlinLogo = """ | //
                         .|//
         .|/ \
     """.trimIndent()
     println(kotlinLogo.trimMargin("."))
 }
