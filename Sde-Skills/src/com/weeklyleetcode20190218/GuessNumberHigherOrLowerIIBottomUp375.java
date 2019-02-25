package com.sdeskills.weeklyleetcode20190218;

public class GuessNumberHigherOrLowerIIBottomUp375 {

	public int getMoneyAmount(int n) {
		if (n <= 1)
			return 0;
		int[][] memo = new int[n + 1][n + 1];

		for (int row = 1, col = 1; row <= n; row++) {
			memo[row][col++] = 0;
		}

		for (int iterationCol = 2; iterationCol <= n; iterationCol++) {
			int row = 1;
			int col = iterationCol;
			while (row <= n && col <= n) {
				memo[row][col] = Integer.MAX_VALUE;
				for (int guess = row; guess <= col; guess++) {
					int temp = 0;
					if (guess == n) {
						temp = guess + memo[row][guess - 1];
					} else {
						temp = guess + Math.max(memo[row][guess - 1], memo[guess + 1][col]);
					}
					memo[row][col] = Math.min(memo[row][col], temp);
				}
				row++;
				col++;
			}
		}
		return memo[1][n];
	}
}
