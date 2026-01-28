package calculator

class SimpleCalculator {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun rest(a: Int, b: Int): Int {
        return a - b
    }

    fun multi(a: Int, b: Int): Int {
        return a * b
    }

    fun div(a: Int, b: Int): Double {
        return a.toDouble() / b
    }
}