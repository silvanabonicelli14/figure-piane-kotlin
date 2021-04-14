package com.cgm.figurepiane.entities

import Errors
import com.cgm.figurepiane.interfaces.IShape

class Triangle(private val base: Double, private val height: Double): IShape {

    override fun calculateArea(): Errors {
        return mutableListOf<String>()
            .apply { if (base < 0) this += "'base' field cannot accept negative value" }
            .apply { if (height < 0) this += "'height' field cannot accept negative value" }
            .toList()
    }
    override fun getArea(): Double {
        return (base * height).div(2)
    }
}
