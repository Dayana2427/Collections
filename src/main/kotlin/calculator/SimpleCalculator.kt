package calculator

class SimpleCalculator: Calculator {
    override fun sum(a: Int, b: Int): Int {
        return a + b
    }

    override fun rest(a: Int, b: Int): Int {
        return a - b
    }

    override fun multi(a: Int, b: Int): Int {
        return a * b
    }

    override fun division(a: Int, b: Int): Double {
        return a.toDouble() / b
    }
}