package com.cgm.figurepiane

import com.cgm.figurepiane.entities.Circle
import com.cgm.figurepiane.entities.Rectangle
import com.cgm.figurepiane.entities.Square
import com.cgm.figurepiane.entities.Triangle
import com.cgm.figurepiane.services.InputService
import com.cgm.figurepiane.services.ShapeService

fun main() {

    // Read input
    val radius = InputService.getValueFromCommandLine("radius")?.toDoubleOrNull()
    val base = InputService.getValueFromCommandLine("base")?.toDoubleOrNull()
    val height = InputService.getValueFromCommandLine("height")?.toDoubleOrNull()

    println("Circle's area is ${ShapeService.printAreaOf(Circle(radius))}")
    println("Rectangle's area is ${ShapeService.printAreaOf(Rectangle(base, height))}")
    println("Square's area is ${ShapeService.printAreaOf(Square(base))}")
    println("Triangle's area is ${ShapeService.printAreaOf(Triangle(base, height))}")
}