package com.cgm.figurepiane.entities

import com.cgm.figurepiane.utilities.Errors

open class Rectangle(private val base: Double, private val height: Double): Shape() {

    override fun getArea(): Double {
        return  (base * height)
    }

    override fun checkValues(): Errors {
        return mutableListOf<String>()
            .apply { if (base < 0) this += "'base' field cannot accept negative value" }
            .apply { if (height < 0) this += "'height' field cannot accept negative value" }
            .toList()
    }
    override val shapeName: String get() = "Rectangle"
}

