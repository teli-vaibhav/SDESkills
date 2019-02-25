package com.practice20190216;

public class Q3WaysToMakeCoinChangeRecursive {

	public int getWaysToMakeCoinChange(int[] input, int n) {
		if (input == null || input.length <= 0 || n < 0)
			return 0;
		return getWaysToMakeCoinChangeHelper(input, n, input.length - 1);
	}

	private int getWaysToMakeCoinChangeHelper(int[] input, int n, int index) {
		if (index < 0)
			return 0;
		if (n < 0)
			return 0;
		if (n == 0)
			return 1;
		return getWaysToMakeCoinChangeHelper(input, n, index - 1)
				+ getWaysToMakeCoinChangeHelper(input, n - input[index], index);
	}
}
