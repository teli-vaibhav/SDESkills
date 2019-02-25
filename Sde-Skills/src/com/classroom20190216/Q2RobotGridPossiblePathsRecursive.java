package com.practice20190216;

public class Q2RobotGridPossiblePathsRecursive {

	public static int getNumberOfPossibleRobotPaths(int m,int n)
	{
		if (m < 0 || n < 0)
			return 0;
		if (m == 0 && n == 0)
			return 1;
		return getNumberOfPossibleRobotPaths(m - 1, n) + getNumberOfPossibleRobotPaths(m, n - 1);
	}
}
