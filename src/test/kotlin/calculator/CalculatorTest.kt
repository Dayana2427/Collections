package calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class CalculatorTest {

    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun testSum(calculator: Calculator) {
        val result = calculator.sum(10,5)
        val expected = 15
        assertEquals(expected, result)
    }

    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun testRest(calculator: Calculator) {
        val result = calculator.rest(10,5)
        val expected = 5
        assertEquals(expected, result)
    }

    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun testMulti(calculator: Calculator) {
        val result = calculator.multi(10,5)
        val expected = 50
        assertEquals(expected, result)
    }

    @ParameterizedTest
    @MethodSource("calculatorSource")
    fun testDiv(calculator: Calculator) {
        val result = calculator.division(10,2)
        val expected = 5.0
        assertEquals(expected, result, 0.001)
    }


    companion object{

        @JvmStatic
        fun calculatorSource() = listOf(SimpleCalculator(), LoggingCalculator())
    }
}

//    @Test
//    fun `When 50 Add To 100 Then Result 150`() {
//        val result = calculator.sum(100,50)
//        val expected = 150
//        assertEquals(expected, result)
//    }