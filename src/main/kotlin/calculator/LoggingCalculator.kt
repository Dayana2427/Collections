package calculator

class LoggingCalculator {
    fun sum(a: Int, b: Int): Int {
        val result = a + b
        println("Operaction sum($a, $b). Result: $result")
        return result
    }

    fun rest(a: Int, b: Int): Int {
        val result = a - b
        println("Operaction rest($a, $b). Result: $result")
        return result
    }

    fun multi(a: Int, b: Int): Int {
        val result = a * b
        println("Operaction multi($a, $b). Result: $result")
        return result
    }

    fun div(a: Int, b: Int): Double {
        val result = a.toDouble() / b
        println("Operaction sum($a, $b). Result: $result")
        return result
    }
}