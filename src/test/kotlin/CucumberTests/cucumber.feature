Feature: SimpleCalc
  SimpleCalc allows us to add and multiply two numbers as well as gives us an ability to sum only odd numbers from an array of integers.
#  Background:
#    Given I have a SimpleCalculator class to use

  Rule: Positive numbers

    Scenario: Adding two positive numbers
      Given I use the calculator to add two positive numbers
      When I add 20 and 32
      Then the result should be 52

    Scenario: Multiplying two positive numbers
      Given I use the calculator to multiply two positive numbers
      When I multiply 21.2 by 3.2
      Then The result should be 67.84

    Scenario: Sum of evens function
      Given I use the calculator to find out the sum of odd numbers in a integer array which only contains positive numbers
      When I use 2,45,20,4,5,6 as my data
      Then The sum will be 32


  Rule: Negative numbers

    Scenario: Adding negative numbers
      Given I use the calculator to add two negative numbers
      When I add -12 and -32
      Then The result is -44

    Scenario: Sum of evens with negative values
      Given I use the calculator to find out the sum of odd numbers in a an integer array which only has negative values
      When I use -10,-2,-3,-4,-5,-6 as my dataset
      Then The result should be 0.0

    Scenario: Multiplying negative numbers
      Given I use the calculator to multiply two negative numbers
      When I multiply -5.2 and -3.2
      Then The result double: 16.64


  Rule: Zeros

    Scenario: Adding zeroes using integers
      Given I use the calculator to add two zeros and my input is an integer and not a double
      When I add 0 to 0
      Then The result is 0


    Scenario: Multiplying a number by zero
      Given I use the calculator to multiply a number by zero
      When I multiply 3.2 by this double 0.0
      Then I get this 0.0


    Scenario: Sum of evens from array of zeros
      Given I use the calculator to sum the even numbers from an array of zeroes
      When I use these numbers: 0,0,0,0 as my dataset
      Then The sum of odd numbers would be 0

