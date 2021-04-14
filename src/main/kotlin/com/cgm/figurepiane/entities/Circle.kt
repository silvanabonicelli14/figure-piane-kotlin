package com.cgm.figurepiane.entities

import com.cgm.figurepiane.utilities.Errors
import kotlin.math.pow
import kotlin.math.roundToLong

class Circle(private val radius: Double) : Shape() {
    private val pi = (Math.PI * 100).roundToLong() / 100.0 //Rounded two decimals

    override fun checkValues(): Errors {
        return mutableListOf<String>()
            .apply { if (radius < 0) this += "'radius' field cannot accept negative value" }
            .toList()
    }

    override fun calculateArea(): Double {
        return radius.pow(2).times(pi)
    }
}