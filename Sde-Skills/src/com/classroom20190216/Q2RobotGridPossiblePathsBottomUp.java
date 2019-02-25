package com.practice20190216;

public class Q2RobotGridPossiblePathsBottomUp {
	public int getNumberOfPossibleRobotPaths(int m, int n) {
		if (m < 0 || n < 0)
			return 0;
		int[][] memo = new int[m + 1][m + 1];
		for (int colIndex = 0; colIndex <= n; colIndex++) {
			memo[0][colIndex] = 1;
		}
		for (int rowIndex = 0; rowIndex <= m; rowIndex++) {
			memo[rowIndex][0] = 1;
		}
		for (int rowIndex = 1; rowIndex <= m; rowIndex++) {
			for (int colIndex = 1; colIndex <= n; colIndex++) {
				memo[rowIndex][colIndex] = memo[rowIndex - 1][colIndex] + memo[rowIndex][colIndex - 1];
			}
		}
		return memo[m][n];
	}
}
