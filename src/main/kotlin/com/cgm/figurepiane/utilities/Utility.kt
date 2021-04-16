package com.cgm.figurepiane.utilities

import com.cgm.figurepiane.entities.Rectangle
import com.cgm.figurepiane.entities.Shape


fun getValueFromCommandLine(context: String): String? {
    println("Insert value of $context")
    return readLine()
}

fun <T:Shape> printShapeArea(figure: T): Double {
    return figure.printArea()
}

//fun <T> printShapeArea(figure: T): Double where T : Shape {
//    return figure.printArea()
//}

fun printAllShapes(shapes: List<Shape>):List<Double>{
    return shapes.map {it.printArea()}
}

fun printADouble(func: () -> Double): Double {
    return func()
}

fun printAreaOf(shape: Shape, func: (Shape) -> Double): Double {
    return func(shape)
}

fun divide(a: Double, b: Double): Double {
    return a / b
}

typealias Errors = List<String>