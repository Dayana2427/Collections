package collections

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

class NumbersMutableListTest {

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun`When add 1 element then size 1`(list: NumbersMutableList) {
        list.add(0)
        assertEquals(1, list.size)
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When list is cleared the size is  elements`(list: NumbersMutableList) {
        repeat(100) {
            list.add(it)
        }
        list.clear()
        assertEquals(0, list.size)
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When list contains element then method returns true`(list: NumbersMutableList) {
        repeat(100) {
            list.add(it)
        }
        assertTrue(list.contains(90))
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When list does not contains element then method returns false`(list: NumbersMutableList) {
        repeat(100) {
            list.add(it)
        }
        assertFalse(list.contains(100))
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When element added to first position then in is in first position`(list: NumbersMutableList) {
        repeat(100){
            list.add(it)
        }
        list.add(0, 1000)
        assertEquals(1000, list[0])
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When element added to last position then in is in last position`(list: NumbersMutableList) {
        repeat(100){
            list.add(it)
        }
        list.add(100, 1000)
        assertEquals(1000, list[100])
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun`When add 10 element then size 10`(list: NumbersMutableList) {
        repeat(10) {
           list + it
        }
        assertEquals(10, list.size)
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun`When add 100 element then size 100`(list: NumbersMutableList) {
        repeat(100) {
           list.add(it)
        }
        assertEquals(100, list.size)
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun`When get 5th elemet the result is correct`(list: NumbersMutableList) {
        repeat(10) {
            list.add(it)
        }
        assertEquals(5, list[5])
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun`When get 50th elemet the result is correct`(list: NumbersMutableList) {
        repeat(100) {
            list.add(it)
        }
        assertEquals(50, list[50])
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When  element removed then size decreased`(list: NumbersMutableList) {
        repeat(100) {
            list.add(it)
        }
        list.removeAt(50)
        assertEquals(99, list.size)
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When removed 50th element next value at this position`(list: NumbersMutableList) {
        repeat(100) {
            list.add(it)
        }
        list.removeAt(50)
        assertEquals(51, list[50])
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When removed value 50 next value at this position`(list: NumbersMutableList) {
        repeat(100) {
            list.add(it)
        }
        list - 50
        assertEquals(51, list[50])
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When method get invoked whit wrong index then exception is throw`(list: NumbersMutableList) {
        repeat(10) {
            list.add(it)
        }
        assertThrows<IndexOutOfBoundsException> {
            list[10]
        }
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When method get invoked whit negative index then exception is throw`(list: NumbersMutableList) {
        repeat(10) {
            list.add(it)
        }
        assertThrows<IndexOutOfBoundsException> {
            list[-10]
        }
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When method add invoked whit wrong index then exception is throw`(list: NumbersMutableList) {
        repeat(10) {
            list.add(it)
        }
        assertThrows<IndexOutOfBoundsException> {
            list.add(11, 1000)
        }
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When method add invoked whit negative index then exception is throw`(list: NumbersMutableList) {
        repeat(10) {
            list.add(it)
        }
        assertThrows<IndexOutOfBoundsException> {
            list.add(-1, 100)
        }
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When method removeAt invoked whit wrong index then exception is throw`(list: NumbersMutableList) {
        repeat(10) {
            list.add(it)
        }
        assertThrows<IndexOutOfBoundsException> {
            list.removeAt(10)
        }
    }

    @ParameterizedTest
    @MethodSource("mutableListSource")
    fun `When method removeAt invoked whit negative index then exception is throw`(list: NumbersMutableList) {
        repeat(10) {
            list.add(it)
        }
        assertThrows<IndexOutOfBoundsException> {
            list.removeAt(-1)
        }
    }













    companion object {

        @JvmStatic
        fun mutableListSource() = listOf(NumbersArrayList(), NumbersLinkedList())
    }
}