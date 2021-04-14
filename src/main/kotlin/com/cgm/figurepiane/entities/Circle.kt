package com.cgm.figurepiane.entities

import Errors
import com.cgm.figurepiane.interfaces.IShape
import kotlin.math.pow
import kotlin.math.roundToLong

class Circle(private val radius: Double) : IShape {
    private val pi = (Math.PI * 100).roundToLong() / 100.0 //Rounded two decimals

    override fun calculateArea(): Errors {
        return mutableListOf<String>()
            .apply { if (radius < 0) this += "'radius' field cannot accept negative value" }
            .toList()
    }

    override fun getArea(): Double {
        return radius.pow(2).times(pi)
    }
}