package de.thermondo.solutions.basics

/**
 * There are two ways of declaring variables in kotlin:
 * val (value) immutable
 * var (variable) mutable
 */

/**
 * Let's define an immutable variable with the following constraints:
 * name: immutableValue
 * value : 15
 */
@Suppress("MagicNumber", "MayBeConst")
val immutableValue = 15

/**
 * Let's define a mutable variable with the following constraints:
 * name: mutableValue
 * value : 16
 */
@Suppress("MagicNumber")
var mutableValue = 16
