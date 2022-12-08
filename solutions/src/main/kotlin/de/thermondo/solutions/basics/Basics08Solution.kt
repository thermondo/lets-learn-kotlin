package de.thermondo.solutions.basics

/*
 * This is an extension of the previous example.
 *
 * Here let's create another enum class named Basics08Solution that accepts following parameters
 * @param r: Int
 * @param g: Int
 * @param b: Int
 * to specify the intensity of the different colors based upon its rgb(RED, GREEN, BLUE)
 * values using the following formula: (r * 256 + g) * 256 + b
 * Ex: RED(255, 0, 0) = 16711680
 */
@Suppress("MagicNumber")
enum class Basics08Solution(val r: Int, val g: Int, val b: Int) {

    RED(255, 0, 0),
    ORANGE(255, 265, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    val x = 256
    fun rgb() = (r * x + g) * x + b
}
