package com.practice20190216;

/**
 * The time complexity for this approach is fib(n) because the size of the left
 * branch in resursion would be fib(n-1) and the size of the right branch would
 * be fib(n-2), overall it is fib(n) including the root Space complexity is O(n)
 * as the recursive stack would go as deep as n elements
 * 
 * @author Teli
 *
 */
public class Q1FibonacciNaiveRecursion {

	public int getNthFibonacciNumber(int n) {
		// Invalid input
		if (n <= 0)
			return Integer.MIN_VALUE;
		// The first fibonacci number is 0 and the second is 1
		if (n == 1 || n == 2)
			return n - 1;
		return getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
	}
}
