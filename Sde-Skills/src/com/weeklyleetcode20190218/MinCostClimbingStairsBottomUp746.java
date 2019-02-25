package com.sdeskills.weeklyleetcode20190218;

public class MinCostClimbingStairsBottomUp746 {
	public int minCostClimbingStairs(int[] cost) {
		if (cost == null || cost.length <= 2)
			return 0;
		int first = 0;
		int second = 0;
		int result = 0;
		for (int index = 2; index <= cost.length; index++) {
			result = Math.min(second + cost[index - 1], first + cost[index - 2]);
			first = second;
			second = result;
		}
		return result;
	}
}
