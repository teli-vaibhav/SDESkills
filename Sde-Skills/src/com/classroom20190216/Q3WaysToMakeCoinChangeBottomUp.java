package com.practice20190216;

public class Q3WaysToMakeCoinChangeBottomUp {

	public int getWaysToMakeCoinChange(int[] input, int n) {
		if (input == null || input.length <= 0 || n < 0)
			return 0;
		int[][] memo = new int[input.length + 1][n + 1];
		for (int rowIndex = 0; rowIndex < memo.length; rowIndex++) {
			memo[rowIndex][0] = 1;
		}

		for (int rowIndex = 1; rowIndex < memo.length; rowIndex++) {
			for (int colIndex = 1; colIndex < memo[0].length; colIndex++) {
				int withoutThisCoin = memo[rowIndex - 1][colIndex];
				int withThisCoin = (colIndex - input[rowIndex - 1]) >= 0
						? memo[rowIndex][colIndex - input[rowIndex - 1]]
						: 0;
				memo[rowIndex][colIndex] = withoutThisCoin + withThisCoin;
			}
		}
		return memo[input.length][n];
	}
}
