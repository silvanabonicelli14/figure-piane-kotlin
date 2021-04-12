package com.cgm.figurepiane

import com.cgm.figurepiane.services.InputService
import com.cgm.figurepiane.services.ShapePrinterService

fun main() {

    val inputService = InputService()
    val radius = inputService.getValueFromCommandLine("radius")?.toDoubleOrNull()
    val base = inputService.getValueFromCommandLine("base")?.toDoubleOrNull()
    val height = inputService.getValueFromCommandLine("height")?.toDoubleOrNull()

    println("Circle's area is ${ShapePrinterService().printCircleArea(radius)}")
    println("Rectangle's area is ${ShapePrinterService().printRectangleArea(base,height)}")
    println("Square's area is ${ShapePrinterService().printSquareArea(base)}")
    println("Triangle's area is ${ShapePrinterService().printTriangleArea(base,height)}")
}