package de.thermondo.utils

fun stringFromFile(path: String): String? =
    object {}.javaClass.getResource(path)?.readText()?.trim()
