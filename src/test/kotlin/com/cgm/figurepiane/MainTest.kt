package com.cgm.figurepiane
import com.cgm.figurepiane.services.ShapePrinterService
import org.junit.Assert
import org.junit.Test

class MainTest {

    private val radius: Double = 1.0
    private val base: Double = 1.0
    private val height: Double = 3.0

    @Test
    fun printRectangleNullBaseParameter_ReturnsNull() {
        val area = ShapePrinterService().printRectangleArea(null,height)
        Assert.assertNull(area)
    }

    @Test
    fun printRectangleNullHeightParameter_ReturnsNull() {
        val area = ShapePrinterService().printRectangleArea(base,null)
        Assert.assertNull(area)
    }

    @Test
    fun printRectangleNotValidBaseParameter_ReturnsNull() {
        val base = "string".toDoubleOrNull()
        val area = ShapePrinterService().printRectangleArea(base,height)
        Assert.assertNull(area)
    }

    @Test
    fun printRectangleNotValidHeightParameter_ReturnsNull() {
        val height = "string".toDoubleOrNull()
        val area = ShapePrinterService().printRectangleArea(base,height)
        Assert.assertNull(area)
    }

    @Test
    fun printRectangle_HappyPath() {
        val expectedArea = 3.0
        val area = ShapePrinterService().printRectangleArea(base,height)
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printSquareNullBaseParameter_ReturnsNull() {
        val area = ShapePrinterService().printSquareArea(null)
        Assert.assertNull(area)
    }

    @Test
    fun printSquareNotValidBaseParameter_ReturnsNull() {
        val base = "string".toDoubleOrNull()
        val area = ShapePrinterService().printSquareArea(base)
        Assert.assertNull(area)
    }

    @Test
    fun printSquare_HappyPath() {
        val expectedArea = 1.0
        val area = ShapePrinterService().printSquareArea(base)
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printTriangleNullBaseParameter_ReturnsNull() {
        val area = ShapePrinterService().printTriangleArea(null,height)
        Assert.assertNull(area)
    }

    @Test
    fun printTriangleNotValidBaseParameter_ReturnsNull() {
        val base = "string".toDoubleOrNull()
        val area = ShapePrinterService().printTriangleArea(base,height)
        Assert.assertNull(area)
    }

    @Test
    fun printTriangleNotValidHeightParameter_ReturnsNull() {
        val height = "string".toDoubleOrNull()
        val area = ShapePrinterService().printTriangleArea(base,height)
        Assert.assertNull(area)
    }

    @Test
    fun printTriangleNullHeightParameter_ReturnsNull() {
        val area = ShapePrinterService().printTriangleArea(base,null)
        Assert.assertNull(area)
    }

    @Test
    fun printTriangle_HappyPath() {
        val expectedArea = 1.5
        val area = ShapePrinterService().printTriangleArea(base,height)
        Assert.assertTrue(expectedArea == area)
    }

    @Test
    fun printCircleNullRadiusParameter_ReturnsNull() {
        val area = ShapePrinterService().printCircleArea(null)
        Assert.assertNull(area)
    }

    @Test
    fun printCircleNotValidRadiusParameter_ReturnsNull() {
        val base = "string".toDoubleOrNull()
        val area = ShapePrinterService().printCircleArea(base)
        Assert.assertNull(area)
    }

    @Test
    fun printCircle_HappyPath() {
        val expectedArea = 3.14
        val area = ShapePrinterService().printCircleArea(radius)
        Assert.assertTrue(expectedArea == area)
    }
}