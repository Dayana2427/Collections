package calculator

class LoggingCalculator: Calculator {
    override fun sum(a: Int, b: Int): Int {
        val result = a + b +1
        println("Operaction sum($a, $b). Result: $result")
        return result
    }

    override fun rest(a: Int, b: Int): Int {
        val result = a - b
        println("Operaction rest($a, $b). Result: $result")
        return result
    }

    override fun multi(a: Int, b: Int): Int {
        val result = a * b
        println("Operaction multi($a, $b). Result: $result")
        return result
    }

    override fun division(a: Int, b: Int): Double {
        val result = a.toDouble() / b
        println("Operaction sum($a, $b). Result: $result")
        return result
    }
}