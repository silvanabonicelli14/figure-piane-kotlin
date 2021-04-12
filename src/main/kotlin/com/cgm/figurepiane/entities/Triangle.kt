package com.cgm.figurepiane.entities

import com.cgm.figurepiane.interfaces.Shape

data class Triangle(val base: Double?, val height: Double?) : Shape {
    override fun getArea(): Double? {
        return when {
            base != null && height != null -> (base * height)/2
            else -> null
        }
    }
}