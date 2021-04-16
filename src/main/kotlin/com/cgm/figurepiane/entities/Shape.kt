package com.cgm.figurepiane.entities

import com.cgm.figurepiane.interfaces.IShape
import com.cgm.figurepiane.utilities.Errors

abstract class  Shape: IShape {

    fun printArea(): Double {
        checkValues().takeIf { it.isNotEmpty() }?.let { error("Cannot calculate shape area: $it") }
        return getArea()
    }
    protected abstract fun checkValues(): Errors
}