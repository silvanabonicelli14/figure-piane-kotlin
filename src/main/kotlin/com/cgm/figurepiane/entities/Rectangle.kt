package com.cgm.figurepiane.entities

import Errors
import com.cgm.figurepiane.interfaces.IShape

open class Rectangle(private val base: Double, private val height: Double): IShape {

    override fun getArea(): Double {
        return  (base * height)
    }

    override fun calculateArea(): Errors {
        return mutableListOf<String>()
            .apply { if (base < 0) this += "'base' field cannot accept negative value" }
            .apply { if (height < 0) this += "'height' field cannot accept negative value" }
            .toList()
    }
}

