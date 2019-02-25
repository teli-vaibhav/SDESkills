package com.practice20190216;

/**
 * The time complexity of this approach is O(n) as we save the previously
 * computed results in a dictionary. The space complexity for this solution is
 * O(n) as we use a dictionary size of n to save the previously computed
 * results. In reality the total space is 2*n as we have a recursive stack of
 * size n in addition to the dictionary, however asymptotically it is O(n)
 * 
 * @author Teli
 *
 */
public class Q1FibonacciTopDown {

	public int getNthFibonacciNumber(int n) {
		// Invalid input
		if (n <= 0)
			return Integer.MIN_VALUE;
		int[] memo = new int[n];
		// Java default initializes all elements of an array to 0, so one iteration to
		// change that to -1
		for (int index = 0; index < n; index++) {
			memo[index] = -1;
		}
		// First fibonacci number is 0 & the second is 1
		memo[0] = 0;
		memo[1] = 1;
		return getNthFibonacciNumberHelper(n, memo);
	}

	private static int getNthFibonacciNumberHelper(int n, int[] memo) {
		// The array was initialized to a dummy value of -1
		if(memo[n-1]!=-1)
			return memo[n - 1];
		memo[n - 1] = getNthFibonacciNumberHelper(n - 1, memo) + getNthFibonacciNumberHelper(n - 2, memo);
		return memo[n - 1];

	}
}
