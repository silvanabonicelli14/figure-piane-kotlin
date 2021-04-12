package com.cgm.figurepiane.entities

import com.cgm.figurepiane.interfaces.Shape

data class Circle(val radius: Double?) : Shape {
    private val pi = 3.14
    override fun getArea(): Double? {
        return when {
            radius != null -> (radius * radius) * pi
            else -> null
        }
    }
}