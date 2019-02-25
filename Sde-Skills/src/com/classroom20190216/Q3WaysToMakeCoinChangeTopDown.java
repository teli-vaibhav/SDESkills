package com.practice20190216;

public class Q3WaysToMakeCoinChangeTopDown {

	public int getWaysToMakeCoinChange(int[] input, int n) {
		if (input == null || input.length <= 0 || n < 0)
			return 0;
		int[][] memo = new int[input.length][n + 1];
		return getWaysToMakeCoinChangeHelper(input, n, input.length - 1, memo);
	}

	private int getWaysToMakeCoinChangeHelper(int[] input, int n, int index, int[][] memo) {
		if (index < 0)
			return 0;
		if (n < 0)
			return 0;
		if (n == 0)
			return 1;
		if (memo[index][n] != 0)
			return memo[index][n];
		memo[index][n] = getWaysToMakeCoinChangeHelper(input, n, index - 1, memo)
				+ getWaysToMakeCoinChangeHelper(input, n - input[index], index, memo);
		return memo[index][n];
	}
}
