package com.cgm.figurepiane.services

import com.cgm.figurepiane.interfaces.IShape

class ShapePrinterService {

    fun <T> printAreaOf(figure: T): Double? where T : IShape {
          return figure.getArea()
    }
}