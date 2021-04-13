package com.cgm.figurepiane.entities

import com.cgm.figurepiane.interfaces.IShape

open class Shape(private val base: Double?, private val height: Double?, private val divisor: Int = 1) : IShape {
    override fun getArea(): Double? {
        return when {
            base == null ||  height == null -> null
            else -> (base * height).div(divisor)
        }
    }
}