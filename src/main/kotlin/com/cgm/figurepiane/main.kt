package com.cgm.figurepiane

import com.cgm.figurepiane.entities.*
import com.cgm.figurepiane.utilities.*

fun main() {

    // Read input
    val radius = getValueFromCommandLine("radius")?.toDoubleOrNull()
    val base = getValueFromCommandLine("base")?.toDoubleOrNull()
    val height = getValueFromCommandLine("height")?.toDoubleOrNull()

    if (radius != null) println("Circle's area is ${Circle(radius).printArea()}")
    if (base != null && height != null) println("Rectangle's area is ${Rectangle(base, height).printArea()}")
    if (base != null) println("Square's area is ${Square(base).printArea()}")
    if (base != null && height != null) println("Triangle's area is ${Triangle(base, height).printArea()}")

    //Fun as argument of function
    println("Print this double from Rectangle class-> ${printADouble { Rectangle(2.0,2.0).getArea() }}")
    println("Print this double form generic function -> ${printADouble { divide(8.2, 2.2) }}")
    //Fun as argument of function with lambda
    if (base != null && height != null)
        println("Print area from shape function -> ${printAreaOf(Rectangle(base,height)) { a -> a.getArea()}}")

}