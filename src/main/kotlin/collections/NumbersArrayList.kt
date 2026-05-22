package collections

class NumbersArrayList(initialCapacity: Int = INITIAL_CAPACITY) : NumbersMutableList {

    private var numbers = arrayOfNulls<Int>(INITIAL_CAPACITY)

    override var size: Int = 0
        private set

    override fun add(number: Int) {
        growIfNeeded()
        numbers[size] = number
        size++
    }

    override fun plus(number: Int) {
        add(number)
    }

    override fun minus(number: Int) {
        remove(number)
    }

    private fun growIfNeeded(){
        if (numbers.size == size) {
            val newArray = arrayOfNulls<Int>(numbers.size * 2)
            for (index in numbers.indices) {
                newArray[index] = numbers[index]
            }
            numbers = newArray
        }
    }

    override fun add(index: Int, number: Int) {
        checkIndexForAdding(index)
        growIfNeeded()
        for (i in size downTo index + 1) {
            numbers[i] = numbers[i + 1]
        }
        numbers[index] = number
        size++
    }

    override fun removeAt(index: Int) {
        checkIndex(index)
        for (i in index until size - 1){
            numbers[i] = numbers[i + 1]
        }
        size--
        numbers[size] = null
    }

    override fun clear() {
        numbers = arrayOfNulls<Int>(INITIAL_CAPACITY)
        size = 0
    }

    override fun contains(number: Int): Boolean {
        for (i in 0 until size) {
            if (numbers[i] == number) {
                return true
            }
        }
        return false
    }

    override fun remove(number: Int) {
        for (i in 0 until size) {
            if (numbers[i] == number) {
                removeAt(i)
                return
            }
         }
    }

    private fun checkIndex(index: Int) {
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException("Index: $index Size: $size")
        }
    }

    private fun checkIndexForAdding(index: Int) {
        if (index < 0 || index > size) {
            throw IndexOutOfBoundsException("Index: $index Size: $size")
        }
    }

    override fun get(index: Int): Int {
        checkIndex(index)
        return numbers[index]!!
    }

    companion object {
        private const val INITIAL_CAPACITY = 10
    }
}