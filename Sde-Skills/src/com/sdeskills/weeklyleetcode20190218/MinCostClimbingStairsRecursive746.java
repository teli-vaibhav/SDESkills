package com.sdeskills.weeklyleetcode20190218;

public class MinCostClimbingStairsRecursive746 {

	public int minCostClimbingStairs(int[] cost) {
		if (cost == null || cost.length <= 2)
			return 0;
		return minCostClimbingStairsHelper(cost, cost.length);
	}

	private int minCostClimbingStairsHelper(int[] cost, int step) {
		if (step == 0 || step == 1)
			return 0;
		return Math.min(minCostClimbingStairsHelper(cost, step - 1) + cost[step - 1],
				minCostClimbingStairsHelper(cost, step - 2) + cost[step - 2]);
	}
}
