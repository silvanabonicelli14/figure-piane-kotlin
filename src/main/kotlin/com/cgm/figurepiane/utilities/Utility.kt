package com.cgm.figurepiane.utilities

import com.cgm.figurepiane.entities.Shape


fun getValueFromCommandLine(context: String): String? {
    println("Insert value of $context")
    return readLine()
}

fun <T> printShapeArea(figure: T): Double where T : Shape {
    return figure.printArea()
}

fun printAllShapes(shapes: List<Shape>):List<Double>{
    return shapes.map {it.printArea()}
}

typealias Errors = List<String>