package com.cgm.figurepiane

open class Rectangle(private val base: Double, private val height: Double) : Shape {
    override fun getArea(): Double = base * height
}