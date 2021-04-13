package com.cgm.figurepiane.services

object InputService {
    fun getValueFromCommandLine(context: String): String? {
        println("Insert value of $context")
        return readLine()
    }
}