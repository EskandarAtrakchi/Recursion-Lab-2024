# Java Code Explanation

The provided Java code contains three functions and a main method to demonstrate their usage.

## `power` Function

```java
public static int power(int x, int y) {
    if (y == 0) {
        return 1; // Exponent of 0 is 1 in all conditions
    } else {
        return x * power(x, y - 1);
    }
}
```

## This function calculates the power of x to the power of y.
## The base case checks if y is 0, in which case it returns 1.
## Otherwise, it recursively multiplies x by the result of power(x, y - 1).

# powerIterative Function
```java
public static int powerIterative(int x, int y) {
    int result = 1;
    while (y > 0) {
        result *= x; // Accumulates the result by multiplying x until y becomes 0
        y--; // Decrements y in each iteration
    }
    return result;
}
```
## This function calculates the power of x to the power of y using a while loop.
## It initializes result to 1 and multiplies it by x in each iteration until y becomes 0.


# isPalindrome Function
```java
public static boolean isPalindrome(String s) {
    if (s.length() <= 1) {
        return true; // Base case: String with 0 or 1 character is a palindrome
    } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
        return false; // If first and last characters don't match, it's not a palindrome
    }
    return isPalindrome(s.substring(1, s.length() - 1)); //check the substring
}
```

## first if to check if the String is one character long or zero length, returns true
## second statement is that If first and last characters don't match, it's not a palindrome
## returns boolean by check the substring