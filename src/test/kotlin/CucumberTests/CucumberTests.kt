package CucumberTests

import SimpleCalculator

import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import io.cucumber.java.en.Then
import org.testng.Assert

class CucumberTests {


    var result = 0
    var doubleResult = 0.0

    @Given("I use the calculator to add two positive numbers")
    fun iUseTheCalculator() {
        //nothing here as SimpleCalc is an object. Should it've been a class we could instantiate it here
    }

    @When("I add {int} and {int}")
    fun iAddFiveAndSix(x:Int,y:Int) {
        result = SimpleCalculator.add(x,y)
    }

    @Then("the result should be {int}")
    fun theResultShouldBe(x:Int) {
        Assert.assertEquals(result, x)
    }



    @Given("I use the calculator to multiply two positive numbers")
    fun iMultiTwoPositives(){

    }
    @When("I multiply {double} by {double}")
    fun multi(double1: Double, double2: Double){
        doubleResult = SimpleCalculator.multiply(double1,double2)
    }
    @Then("The result should be {double}")
    fun multiResult(double1: Double) {
        Assert.assertEquals(doubleResult,double1 )
    }



    @Given("I use the calculator to find out the sum of odd numbers in a integer array which only contains positive numbers")
    fun oddPositives(){

    }
    @When("I use {int},{int},{int},{int},{int},{int} as my data")
    fun posDataset(x:Int,y:Int,z:Int,p:Int,i:Int,b:Int){
        val array = intArrayOf(x,y,z,p,i,b)
        result = SimpleCalculator.sumOffEvens(array)
    }
    @Then("The sum will be {int}")
    fun oddsposresult(x:Int){
        Assert.assertEquals(result,x)
    }

    //Negatives

    @Given("I use the calculator to add two negative numbers")
    fun twoNegativesAdd(){

    }
    @When("I add {int} to {int}")
    fun addNegatives(x2:Int,y2:Int){
        result = SimpleCalculator.add(x2,y2)
    }
    @Then("The result is {int}")
    fun negativesaddresult(x:Int){
        Assert.assertEquals(result,x)
    }


    @Given("I use the calculator to find out the sum of odd numbers in a an integer array which only has negative values")
    fun negativearray(){

    }
    @When("I use {int},{int},{int},{int},{int},{int} as my dataset")
    fun negativearraytest(x:Int,y:Int,z:Int,q:Int,h:Int,l:Int){
        val array = intArrayOf(x,y,z,q,h,l)
        result = SimpleCalculator.sumOffEvens(array)
    }
    @Then("The sum of odd numbers would be {int}")
    fun negativeArrayResult(x:Int){
        Assert.assertEquals(result,x)
    }

    @Given("I use the calculator to multiply two negative numbers")
    fun multiTwoNegs(){

    }
    @When("I multiply {double} and {double}")
    fun multiplyNegs(x:Double,y:Double){
        doubleResult = SimpleCalculator.multiply(x,y)
    }
    @Then("The result double: {double}")
    fun testNegResult(x:Double){
        Assert.assertEquals(doubleResult,x)
    }


    //Zeros


    @Given("I use the calculator to multiply a number by zero")
    fun calcZeroDoubles(){}
    @When("I multiply {double} by this double {double}")
    fun calcAddDoubles(x:Double,y:Double){
        doubleResult = SimpleCalculator.multiply(x,y)
    }
    @Then("I get this {double}")
    fun zeroDoubleResult(x:Double){
        Assert.assertEquals(doubleResult,x)
    }


    @Given("I use the calculator to add two zeros and my input is an integer and not a double")
    fun twozeroadd(){}
    @When("I try to add {int} and {int}")
    fun addTwoIntegerZeroes(x:Int, y:Int){
        result = SimpleCalculator.add(x,y)
    }
    @Then("The result is equals {int}")
    fun zeroIntegerResult(x:Int){
        Assert.assertEquals(result,x)
    }

    @Given("I use the calculator to sum the even numbers from an array of zeroes")
    fun zerosarrays(){}
    @When("I use these numbers: {int},{int},{int},{int} as my dataset")
    fun oddSumZeroArrays(x:Int,y:Int,l:Int,o:Int){
        val array = intArrayOf(x,y,l,o)
        result = SimpleCalculator.sumOffEvens(array)
    }
    @Then("The result sum is 0")
    fun zeroEvenSumArrayResult(){
        Assert.assertEquals(result,0)
    }

}