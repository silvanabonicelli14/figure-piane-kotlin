package com.cgm.figurepiane

import com.cgm.figurepiane.entities.*
import com.cgm.figurepiane.utilities.getValueFromCommandLine

fun main() {

    // Read input
    val radius = getValueFromCommandLine("radius")?.toDoubleOrNull()
    val base = getValueFromCommandLine("base")?.toDoubleOrNull()
    val height = getValueFromCommandLine("height")?.toDoubleOrNull()

    if (radius != null) println("Circle's area is ${Circle(radius).printArea()}")
    if (base != null && height != null) println("Rectangle's area is ${Rectangle(base, height).printArea()}")
    if (base != null) println("Square's area is ${Square(base).printArea()}")
    if (base != null && height != null) println("Triangle's area is ${Triangle(base, height).printArea()}")
}