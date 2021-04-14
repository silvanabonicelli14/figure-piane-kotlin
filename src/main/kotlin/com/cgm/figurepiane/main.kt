package com.cgm.figurepiane

import com.cgm.figurepiane.entities.Circle
import com.cgm.figurepiane.entities.Rectangle
import com.cgm.figurepiane.entities.Square
import com.cgm.figurepiane.entities.Triangle
import com.cgm.figurepiane.utilities.getValueFromCommandLine


fun main() {

    // Read input
    val radius = getValueFromCommandLine("radius")?.toDoubleOrNull()
    val base = getValueFromCommandLine("base")?.toDoubleOrNull()
    val height = getValueFromCommandLine("height")?.toDoubleOrNull()

    if (radius != null) println("Circle's area is ${Circle(radius).calculateArea()}")
    if (base != null && height != null) println("Rectangle's area is ${Rectangle(base, height).calculateArea()}")
    if (base != null) println("Square's area is ${Square(base).calculateArea()}")
    if (base != null && height != null) println("Triangle's area is ${Triangle(base, height).calculateArea()}")
}

