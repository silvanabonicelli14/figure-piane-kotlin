package com.cgm.figurepiane

fun main() {

    val radius = 1.0
    val base = 1.0
    val height = 3.0

    println(ShapePrinter().printCircleArea(radius))
    println(ShapePrinter().printRectangleArea(base,height))
    println(ShapePrinter().printSquareArea(base))
    println(ShapePrinter().printTriangleArea(base,height))
}


