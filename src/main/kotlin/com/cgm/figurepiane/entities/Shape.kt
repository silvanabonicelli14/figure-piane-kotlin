package com.cgm.figurepiane.entities

import com.cgm.figurepiane.interfaces.IShape

abstract class Shape(): IShape {
    fun printArea(): Double {
        checkValues().takeIf { it.isNotEmpty() }?.let { error("Cannot calculate shape area: $it") }
        return calculateArea()
    }
}
