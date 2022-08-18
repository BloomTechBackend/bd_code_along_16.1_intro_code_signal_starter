# BD ACS Setup

## Option 1: CodeSignal (Preferred)
Load the starter code for each problem into CodeSignal environment and build out test cases as needed within CodeSignal.

## Option 2: Local environment

#### Project Setup

1. Clone this project to your machine using `git clone <github url>`
2. Open the project in IntelliJ
3. In IntelliJ, complete the solution for each problem and run the tests present in the test directory. Make sure that all the edge cases pass.
4. Enhance the test cases by adding more scenarios that you can think of.
#### Running Your Tests

Hit the play button next to each test case or type the following command into your terminal:

```text
./gradlew clean -q :test --tests "org.bloomtech.bd.codealong*"
```

### Problem 1 : Safe Divide

#### Description

Normally, dividing by zero is a bad thing that will cause programs to crash. Write a safer division function
that returns the division of two numbers (the numerator divided by the denominator) unless the denominator is 0, in which case it should return `0` instead of crashing.

#### Example

Input:

```
numerator = 1
denominator = 2
```

Output:

```
0.5
```

Input:

```
numerator = 12
denominator = 0
```

Output:

```
0
```

### Problem 2 : Letter Count

#### Description

Count the number of occurrences of a letter in a string.

**Do not use any built-in `count()` style functions for this task.**

#### Example

Input:

```
s == "bacab"
letter = "b"
```

Output:

```
2
```

Input:

```
s == "abbb"
letter == "a"
```

Output:

```
1
```

### Problem 3 : Array Sum

#### Description

This function accepts an array. It should return the sum of all elements in the array.

If the input array is empty, return `0`.

#### Example

Input:

```
a == [0, 1, 2, 3]
```

Output:

```
6
```