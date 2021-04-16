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
// Oppure alla vecchia:
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

//extension
fun String.decorateAtTheEnd(decoratorChar: String):String {
   var tmpString = this
   return tmpString + decoratorChar
}

typealias Errors = List<String>

data class myDataClass(val number: Int){
    val secondNumber = 2

    /*override fun toString(): String {
        return "Ti ho fregato la stringa"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }*/

}

