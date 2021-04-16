package com.cgm.figurepiane.entities

class Square(base: Double): Rectangle(base, base){
    override val shapeName: String get() = "Square"
}