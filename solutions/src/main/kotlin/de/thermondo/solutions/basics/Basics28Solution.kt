package de.thermondo.solutions.basics

 fun tripleQuoted(){

     val kotlinLogo = """ | //
                         .|//
         .|/ \
     """.trimIndent()
     println(kotlinLogo.trimMargin("."))
 }
