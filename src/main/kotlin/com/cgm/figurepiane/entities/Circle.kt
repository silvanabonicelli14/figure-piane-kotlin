package com.cgm.figurepiane.entities

import com.cgm.figurepiane.interfaces.IShape
import kotlin.math.pow

class Circle(private val radius: Double?) : IShape {
    private val pi = 3.14

    override fun getArea(): Double? {
        return radius?.let { (radius.pow(2)).times(pi)}
    }
}