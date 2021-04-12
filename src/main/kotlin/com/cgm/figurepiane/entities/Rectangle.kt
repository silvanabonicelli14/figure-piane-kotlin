package com.cgm.figurepiane.entities

import com.cgm.figurepiane.interfaces.Shape

open class Rectangle(private val base: Double?, private val height: Double?) : Shape {
    override fun getArea(): Double? {
        return when {
            base != null && height != null -> base * height
            else -> null
        }
    }
}