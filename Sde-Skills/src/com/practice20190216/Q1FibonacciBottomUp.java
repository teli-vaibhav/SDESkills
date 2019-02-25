package com.practice20190216;

/**
 * Time complexity for this solution is O(n) as everything is computed in one
 * iteration Space complexity for this solution is O(1) as only a couple of
 * variables are used to compute this result
 * 
 * @author Teli
 *
 */
public class Q1FibonacciBottomUp {

	public int getNthFibonacciNumber(int n) {
		if (n <= 0)
			return Integer.MIN_VALUE;
		// The first fibonacci number is 0 and the second is 1
		if (n == 1 || n == 2)
			return n - 1;
		int first = 0;
		int second = 1;
		int res = 0;
		for (int index = 3; index <= n; index++) {
			res = first + second;
			first = second;
			second = res;
		}
		return res;
	}
}
