package com.cgm.figurepiane

data class Triangle(val base: Double, val height: Double) : Shape {
    override fun getArea(): Double = (base * height)/2
}