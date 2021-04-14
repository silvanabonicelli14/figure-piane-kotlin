package com.cgm.figurepiane

import com.cgm.figurepiane.entities.Circle
import com.cgm.figurepiane.entities.Rectangle
import com.cgm.figurepiane.entities.Square
import com.cgm.figurepiane.entities.Triangle
import getValueFromCommandLine
import printShapeArea


fun main() {

    // Read input
    val radius = getValueFromCommandLine("radius")?.toDoubleOrNull()
    val base = getValueFromCommandLine("base")?.toDoubleOrNull()
    val height = getValueFromCommandLine("height")?.toDoubleOrNull()

//    println("Circle's area is ${printShapeArea(Circle(radius))}")
//    println("Rectangle's area is ${printShapeArea(Rectangle(base, height))}")
//    println("Square's area is ${printShapeArea(Square(base))}")
//    println("Triangle's area is ${printShapeArea(Triangle(base, height))}")
}

