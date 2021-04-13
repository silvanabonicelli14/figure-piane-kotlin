package com.cgm.figurepiane.entities

import com.cgm.figurepiane.interfaces.IShape
import kotlin.math.pow
import kotlin.math.roundToLong

class Circle(private val radius: Double?) : IShape {
    private val pi = (Math.PI * 100).roundToLong() / 100.0 //Rounded two decimals
    override fun getArea(): Double? {
        return radius?.let { radius.pow(2).times(pi)}
    }
}