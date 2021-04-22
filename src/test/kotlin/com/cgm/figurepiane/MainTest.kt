package com.cgm.figurepiane
import com.cgm.figurepiane.entities.*
import org.junit.Assert
import org.junit.Test
import org.junit.jupiter.api.assertThrows

class MainTest {

    private var radius: Double = 2.5
    private var base: Double = 1.0
    private var height: Double = 3.0

    @Test
    fun printRectangleNonValidValues_ThrowsException() {
        base= (-12).toDouble()
        height = (-12).toDouble()
        assertThrows<IllegalStateException>{Rectangle(base,height).printArea()}
    }

    @Test
    fun printRectangle_HappyPath() {
        val expectedArea = 3.0
        val area = Rectangle(base,height).printArea()
        Assert.assertTrue(expectedArea == area)
    }

    @Test()
    fun printSquareNonValidValues_ThrowsException() {
        base= (-12).toDouble()
        assertThrows<Exception>{Square(base).printArea()}
    }

    @Test
    fun printSquare_HappyPath() {
        val expectedArea = 1.0
        val area = Square(base).printArea()
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printTriangleNonValidValues_ThrowsException() {
        base= (-12).toDouble()
        assertThrows<IllegalStateException>{ Triangle(base,height).printArea()}
    }

    @Test
    fun printTriangle_HappyPath() {
        val expectedArea = 1.5
        val area = Triangle(base,height).printArea()
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printCircleNonValidValues_ThrowsException() {
        radius = (-12).toDouble()
        assertThrows<IllegalStateException>{ Circle(radius).printArea()}
    }

    @Test
    fun printCircle_HappyPath() {
        val expectedArea = 19.625
        val area = Circle(radius).printArea()
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printAllShapes_ThrowException(){
        val shapes: List<Shape> = listOf(
            Rectangle(-2.0,4.0),
            Square(2.0),
            Triangle(3.0,2.0)
        )

        assertThrows<IllegalStateException>{shapes.map { it.printArea() }}
    }

    @Test
    fun printAllShapes_HappyPath(){
        val shapes: List<Shape> = listOf(
            Rectangle(2.0,4.0),
            Square(2.0),
            Triangle(3.0,2.0)
        )
        Assert.assertEquals(listOf(8.0,4.0,3.0), shapes.map { it.printArea() })
    }
}