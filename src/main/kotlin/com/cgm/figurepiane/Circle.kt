package com.cgm.figurepiane

data class Circle(val radius: Double) : Shape {
    private val pi = 3.14
    override fun getArea(): Double = (radius * radius) * pi
}