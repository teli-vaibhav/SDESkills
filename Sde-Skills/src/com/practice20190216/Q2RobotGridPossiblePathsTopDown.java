package com.practice20190216;

public class Q2RobotGridPossiblePathsTopDown {

	public int getNumberOfPossibleRobotPaths(int m, int n) {
		if (m < 0 || n < 0)
			return 0;
		int[][] memo = new int[m + 1][n + 1];
		memo[0][0] = 1;
		return getNumberOfPossibleRobotPathsHelper(m, n, memo);
	}

	private int getNumberOfPossibleRobotPathsHelper(int m, int n, int[][] memo) {
		if (m < 0 || n < 0)
			return 0;
		if (memo[m][n] != 0)
			return memo[m][n];
		memo[m][n] = getNumberOfPossibleRobotPathsHelper(m - 1, n, memo)
				+ getNumberOfPossibleRobotPathsHelper(m, n - 1, memo);
		return memo[m][n];
	}
}
