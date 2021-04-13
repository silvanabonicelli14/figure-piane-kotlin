package com.cgm.figurepiane
import com.cgm.figurepiane.entities.Circle
import com.cgm.figurepiane.entities.Rectangle
import com.cgm.figurepiane.entities.Square
import com.cgm.figurepiane.entities.Triangle
import com.cgm.figurepiane.services.ShapeService
import org.junit.Assert
import org.junit.Test

class MainTest {

    private val radius: Double = 2.5
    private val base: Double = 1.0
    private val height: Double = 3.0

    @Test
    fun printRectangleNullBaseParameter_ReturnsNull() {
        val area = ShapeService.printAreaOf(Rectangle(null,height))
        Assert.assertNull(area)
    }

    @Test
    fun printRectangleNullHeightParameter_ReturnsNull() {
        val area = ShapeService.printAreaOf(Rectangle(base,null))
        Assert.assertNull(area)
    }

    @Test
    fun printRectangleNotValidBaseParameter_ReturnsNull() {
        val base = "string".toDoubleOrNull()
        val area = ShapeService.printAreaOf(Rectangle(base,height))
        Assert.assertNull(area)
    }

    @Test
    fun printRectangleNotValidHeightParameter_ReturnsNull() {
        val height = "string".toDoubleOrNull()
        val area = ShapeService.printAreaOf(Rectangle(base,height))
        Assert.assertNull(area)
    }

    @Test
    fun printRectangle_HappyPath() {
        val expectedArea = 3.0
        val area = ShapeService.printAreaOf(Rectangle(base,height))
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printSquareNullBaseParameter_ReturnsNull() {
        val area = ShapeService.printAreaOf(Square(null))
        Assert.assertNull(area)
    }

    @Test
    fun printSquareNotValidBaseParameter_ReturnsNull() {
        val base = "string".toDoubleOrNull()
        val area = ShapeService.printAreaOf(Square(base))
        Assert.assertNull(area)
    }

    @Test
    fun printSquare_HappyPath() {
        val expectedArea = 1.0
        val area = ShapeService.printAreaOf(Square(base))
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printTriangleNullBaseParameter_ReturnsNull() {
        val area = ShapeService.printAreaOf(Triangle(null,height))
        Assert.assertNull(area)
    }

    @Test
    fun printTriangleNullHeightParameter_ReturnsNull() {
        val area = ShapeService.printAreaOf(Triangle(base,null))
        Assert.assertNull(area)
    }

    @Test
    fun printTriangleNotValidBaseParameter_ReturnsNull() {
        val base = "string".toDoubleOrNull()
        val area = ShapeService.printAreaOf(Triangle(base,height))
        Assert.assertNull(area)
    }

    @Test
    fun printTriangleNotValidHeightParameter_ReturnsNull() {
        val height = "string".toDoubleOrNull()
        val area = ShapeService.printAreaOf(Triangle(base,height))
        Assert.assertNull(area)
    }

    @Test
    fun printTriangle_HappyPath() {
        val expectedArea = 1.5
        val area = ShapeService.printAreaOf(Triangle(base,height))
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printCircleNullRadiusParameter_ReturnsNull() {
        val area = ShapeService.printAreaOf(Circle(null))
        Assert.assertNull(area)
    }

    @Test
    fun printCircleNotValidRadiusParameter_ReturnsNull() {
        val radius = "string".toDoubleOrNull()
        val area = ShapeService.printAreaOf(Circle(radius))
        Assert.assertNull(area)
    }

    @Test
    fun printCircle_HappyPath() {
        val expectedArea = 19.625
        val area = ShapeService.printAreaOf(Circle(radius))
        Assert.assertTrue(expectedArea == area)
    }
}