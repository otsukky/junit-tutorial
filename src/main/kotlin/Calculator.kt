package org.example

class Calculator {
    fun multiply(x: Int, y: Int): Int = x * y

    fun divide(x: Int, y: Int): Float =
        if (y == 0) {
            throw IllegalArgumentException("divide by zero")
        } else {
            x.toFloat() / y.toFloat()
        }
}