object SimpleCalculator {

    fun add(x: Int, y: Int): Int {
        return x + y
    }

    fun multiply(x: Double, y: Double): Double {
        return x * y
    }

    fun sumOffEvens(arr: IntArray): Int {
        var result = 0
        for (i in arr) {
            if (i % 2 == 0) result += i
        }
        return result
    }

}