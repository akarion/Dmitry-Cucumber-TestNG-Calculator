package UnitTests

import SimpleCalculator
import org.testng.Assert
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

class TestNGTests {


    @BeforeClass

    fun greeting(){
        System.out.println("Running TestNG unit tests for SimpleCalculator")
    }


    @Test(testName = "Test add", groups = ["Positive numbers","Add"])
    fun testAdd() {
        val result = SimpleCalculator.add(5, 3)
        Assert.assertEquals(result, 8, "Failure at adding two numbers")
    }

    @Test(testName = "Test add negatives", groups = ["Negative numbers","Add"])
    fun testAddNegatives() {
        val result = SimpleCalculator.add(-5, -32)
        Assert.assertEquals(result, -37, "Failure at adding two negative numbers")
    }

    @Test(testName = "Test multiply", groups = ["Positive numbers","Multiply"])
    fun testMultiply() {
        val result = SimpleCalculator.multiply(5.1, 3.2)
        Assert.assertEquals(result, 16.32, "Failure at multiplying two numbers")
    }

    @Test(testName = "Test multiply negatives", groups = ["Negative numbers","Multiply"])
    fun testMultiplyNegatives() {
        val result = SimpleCalculator.multiply(-5.1, -3.2)
        Assert.assertEquals(result, 16.32, "Failure at multiplying two negative numbers") //fail on purpose to check if failure makes it into the report, should be 16.32
    }

    @Test(testName = "Test sum of evens", groups = ["Positive numbers","Sum of evens"])
    fun testsumOfEvens() {
        val array = intArrayOf(1,2,3,4,5,6)
        val result = SimpleCalculator.sumOffEvens(array)
        Assert.assertEquals(result, 12, "Failure to add only odd numbers")
    }

    @Test(testName = "Test sum of evens negatives", groups = ["Negative numbers","Sum of evens"])
    fun testsumOfEvensNegatives() {
        val array = intArrayOf(-1,-2,-3,-4,-5,-6)
        val result = SimpleCalculator.sumOffEvens(array)
        Assert.assertEquals(result, -12, "Failure to add only negative even numbers")
    }

    @Test(testName = "Test add zeros", groups = ["Zeros","Add"])
    fun testAddZeros() {
        val result = SimpleCalculator.add(0, 0)
        Assert.assertEquals(result, 0, "Failure at adding two zeros")
    }

    @Test(testName = "Test multiply with zeros 1", groups = ["Zeros","Multiply"])
    fun testMultiplyZerosOne() {
        val result = SimpleCalculator.multiply(0.0, 3.2)
        Assert.assertEquals(result, 0.0, "Failure at multiplying a number by zero")
    }

    @Test(testName = "Test multiply with zeros 2", groups = ["Zeros","Multiply"])
    fun testMultiplyZerosTwo() {
        val result = SimpleCalculator.multiply(9.1, 0.0)
        Assert.assertEquals(result, 0.0, "Failure at multiplying a number by zero")
    }

    @Test(testName = "Test sum of evens mixed", groups = ["Mixed numbers","Sum of evens"])
    fun testsumOfEvensMix() {
        val array = intArrayOf(-1,-2,-3,-4,-5,-6,25,-10,43,0,122)
        val result = SimpleCalculator.sumOffEvens(array)
        Assert.assertEquals(result, 100, "Failure to add mixed negative and positive even numbers")
    }

    @Test(testName = "Test sum of evens zeros", groups = ["Zeros","Sum of evens"])
    fun testsumOfEvensZero() {
        val array = intArrayOf(0,0,0,0,0,0,0)
        val result = SimpleCalculator.sumOffEvens(array)
        Assert.assertEquals(result, 0, "Failure to sum evens with all zero array")
    }

    @Test(testName = "Empty test sum of evens", groups = ["Empty","Sum of evens"])
    fun testsumOfEvensEmpty() {
        val array = intArrayOf()
        val result = SimpleCalculator.sumOffEvens(array)
        Assert.assertEquals(result, 0, "Failure to sum evens with empty array")
    }

    @Test(testName = "Test add MAX MIN", groups = ["MAX","Add"])
    fun testAddMaxMin() {
        val result = SimpleCalculator.add(Int.MAX_VALUE, Int.MIN_VALUE)
        Assert.assertEquals(result, -1, "Failure at adding two MAX MIN numbers")
    }

    @Test(testName = "Array with MAX MIN", groups = ["MAX","Sum of evens"])
    fun testsumOfEvensMaxMin() {
        val array = intArrayOf(Int.MAX_VALUE, Int.MIN_VALUE,2,4,-2,125)
        val result = SimpleCalculator.sumOffEvens(array)
        Assert.assertEquals(result, -2147483644, "Failure to handle array with MAX MIN numbers")
    }


    @AfterClass
    fun goodbye(){
        System.out.println("End of TestNG unit tests for SimpleCalc")
    }
}