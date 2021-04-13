package com.cgm.figurepiane

import com.cgm.figurepiane.entities.Circle
import com.cgm.figurepiane.entities.Rectangle
import com.cgm.figurepiane.entities.Square
import com.cgm.figurepiane.entities.Triangle
import com.cgm.figurepiane.services.InputService
import com.cgm.figurepiane.services.ShapePrinterService

fun main() {

    // Init services
    val inputService = InputService()
    val shapePrinterService = ShapePrinterService()
    // Read input
    val radius = inputService.getValueFromCommandLine("radius")?.toDoubleOrNull()
    val base = inputService.getValueFromCommandLine("base")?.toDoubleOrNull()
    val height = inputService.getValueFromCommandLine("height")?.toDoubleOrNull()

    println("Circle's area is ${shapePrinterService.printAreaOf(Circle(radius))}")
    println("Rectangle's area is ${shapePrinterService.printAreaOf(Rectangle(base,height))}")
    println("Square's area is ${shapePrinterService.printAreaOf(Square(base))}")
    println("Triangle's area is ${shapePrinterService.printAreaOf(Triangle(base, height))}")
}