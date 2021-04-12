package com.cgm.figurepiane
import org.junit.Assert
import org.junit.Test

class MainTest {

    private val radius: Double = 1.0
    private val base: Double = 1.0
    private val height: Double = 3.0

    @Test
    fun printRectangleNullParameters_HappyPath() {
        val area = ShapePrinter().printRectangleArea()
        Assert.assertTrue(0.0 == area)
    }

    @Test
    fun printRectangle_HappyPath() {
        val expectedArea = 3.0
        val area = ShapePrinter().printRectangleArea(base,height)
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printSquareNullParameters_HappyPath() {
        val area = ShapePrinter().printSquareArea()
        Assert.assertTrue(0.0 == area)
    }

    @Test
    fun printSquare_HappyPath() {
        val expectedArea = 1.0
        val area = ShapePrinter().printSquareArea(base)
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printTriangleNullParameters_HappyPath() {
        val area = ShapePrinter().printTriangleArea()
        Assert.assertTrue(0.0 == area)
    }

    @Test
    fun printTriangle_HappyPath() {
        val expectedArea = 1.5
        val area = ShapePrinter().printTriangleArea(base,height)
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printCircleNullParameters_HappyPath() {
        val area = ShapePrinter().printCircleArea()
        Assert.assertTrue(0.0 == area)
    }

    @Test
    fun printCircle_HappyPath() {
        val expectedArea = 3.14
        val area = ShapePrinter().printCircleArea(radius)
        Assert.assertTrue(expectedArea == area)
    }
}