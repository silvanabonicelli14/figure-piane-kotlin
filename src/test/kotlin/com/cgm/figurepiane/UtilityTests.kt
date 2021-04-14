package com.cgm.figurepiane
import com.cgm.figurepiane.entities.*
import com.cgm.figurepiane.utilities.printAllShapes
import com.cgm.figurepiane.utilities.printShapeArea
import org.junit.Assert
import org.junit.Test

class UtilityTests {

    private var radius: Double = 2.5
    private var base: Double = 1.0
    private var height: Double = 3.0

    @Test(expected = IllegalStateException::class)
    fun printRectangleNonValidValues_ThrowsException() {
        base= (-12).toDouble()
        height = (-12).toDouble()
        printShapeArea(Rectangle(base,height))
    }

    @Test
    fun printRectangle_HappyPath() {
        val expectedArea = 3.0
        val area = printShapeArea(Rectangle(base,height))
        Assert.assertTrue(expectedArea == area)
    }

    @Test(expected = IllegalStateException::class)
    fun printSquareNonValidValues_ThrowsException() {
        base= (-12).toDouble()
        printShapeArea(Square(base))
    }

    @Test
    fun printSquare_HappyPath() {
        val expectedArea = 1.0
        val area = printShapeArea(Square(base))
        Assert.assertTrue(expectedArea == area)
    }

    @Test(expected = IllegalStateException::class)
    fun printTriangleNonValidValues_ThrowsException() {
        base= (-12).toDouble()
        printShapeArea(Triangle(base,height))
    }

    @Test
    fun printTriangle_HappyPath() {
        val expectedArea = 1.5
        val area = printShapeArea(Triangle(base,height))
        Assert.assertTrue(expectedArea == area)
    }

    @Test(expected = IllegalStateException::class)
    fun printCircleNonValidValues_ThrowsException() {
        radius = (-12).toDouble()
        printShapeArea(Circle(radius))
    }

    @Test
    fun printCircle_HappyPath() {
        val expectedArea = 19.625
        val area = printShapeArea(Circle(radius))
        Assert.assertTrue(expectedArea == area)
    }

    @Test(expected = IllegalStateException::class)
    fun printAllShapes_ThrowException(){
        val shapes: List<Shape> = listOf<Shape>(
            Rectangle(-2.0,4.0),
            Square(2.0),
            Triangle(3.0,2.0)
        )
        printAllShapes(shapes)
    }

    @Test
    fun printAllShapes_HappyPath(){
        val shapes: List<Shape> = listOf<Shape>(
            Rectangle(2.0,4.0),
            Square(2.0),
            Triangle(3.0,2.0)
        )
        Assert.assertEquals(listOf(8.0,4.0,3.0),printAllShapes(shapes))
    }
}