package calculator

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SimpleCalculatorTest {

    private val calculator = SimpleCalculator()

    @Test
    fun testSum() {
        val result = calculator.sum(10,5)
        val expected = 15
        assertEquals(expected, result)
    }


    fun testRest() {
        val result = calculator.rest(10,5)
        val expected = 5
        assertEquals(expected, result)
    }

    fun testMulti() {
        val result = calculator.multi(10,5)
        val expected = 50
        assertEquals(expected, result)
    }

    fun testDiv() {
        val result = calculator.div(10,2)
        val expected = 5.0
        assertEquals(expected, result, 0.001)
    }


//    @Test
//    fun `When 50 Add To 100 Then Result 150`() {
//        val result = calculator.sum(100,50)
//        val expected = 150
//        assertEquals(expected, result)
//    }
}