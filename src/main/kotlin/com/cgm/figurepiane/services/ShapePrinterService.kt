package com.cgm.figurepiane.services

import com.cgm.figurepiane.entities.Circle
import com.cgm.figurepiane.entities.Rectangle
import com.cgm.figurepiane.entities.Square
import com.cgm.figurepiane.entities.Triangle

class ShapePrinterService {
    fun printRectangleArea(base: Double?, height: Double?): Double? = Rectangle(base,height).getArea()
    fun printSquareArea(base: Double?): Double? = Square(base).getArea()
    fun printTriangleArea(base: Double?, height: Double?): Double? = Triangle(base,height).getArea()
    fun printCircleArea(radius: Double?): Double? = Circle(radius).getArea()
}