package com.cgm.figurepiane.services

class InputService {
    fun getValueFromCommandLine(context: String): String? {
        println("Insert value of $context")
        return readLine()
    }
}