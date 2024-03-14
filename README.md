Hello

This is a simple project to show TestNG and Cucumber tests for SimpleCalculator class. Just for practice and future reference.
Written in Kotlin.

Tests are in /src/test/kotlin

# Test runner in Python
There is also Calculator-test-runner.py in root project directory. This script will take at least one argument and optionally a second one.
Usage:

# Run unit tests
Calculator-test-runner --run unittests
# Run BDD scenarios
Calculator-test-runner --run scenarios

You could also specify a folder for test report for both unit and cucumber tests by providing an argument like below:

Calculator-test-runner --run unittests --reports-dir unit-test-reports

Also feel free to check build.gradle.kts for some underlying stuff
