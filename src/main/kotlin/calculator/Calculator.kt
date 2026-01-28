package calculator

interface Calculator {
    fun sum(a: Int, b: Int): Int

    fun rest(a: Int, b: Int): Int

    fun multi(a: Int, b: Int): Int

    fun division(a: Int, b: Int): Double
}