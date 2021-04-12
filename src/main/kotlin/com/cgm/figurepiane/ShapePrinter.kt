package com.cgm.figurepiane

class ShapePrinter {
    fun printRectangleArea(base: Double = 0.0, height: Double = 0.0): Double = Rectangle(base,height).getArea()
    fun printSquareArea(base: Double= 0.0): Double = Square(base).getArea()
    fun printTriangleArea(base: Double= 0.0, height: Double = 0.0 ): Double = Triangle(base,height).getArea()
    fun printCircleArea(radius: Double= 0.0): Double = Circle(radius).getArea()
}