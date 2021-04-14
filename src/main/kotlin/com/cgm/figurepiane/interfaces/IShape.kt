package com.cgm.figurepiane.interfaces

import com.cgm.figurepiane.utilities.Errors

interface IShape {
    fun calculateArea(): Double
    fun checkValues(): Errors
}
