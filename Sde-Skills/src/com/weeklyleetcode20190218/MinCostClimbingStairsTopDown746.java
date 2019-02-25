package com.sdeskills.weeklyleetcode20190218;

public class MinCostClimbingStairsTopDown746 {

	public int minCostClimbingStairs(int[] cost) {
		if (cost == null || cost.length <= 2)
			return 0;
		int[] memo = new int[cost.length + 1];
		for (int index = 2; index < memo.length; index++) {
			memo[index] = -1;
		}
		return minCostClimbingStairsHelper(cost, cost.length, memo);
	}

	private int minCostClimbingStairsHelper(int[] cost, int step, int[] memo) {
		if (memo[step] != -1)
			return memo[step];
		memo[step] = Math.min(minCostClimbingStairsHelper(cost, step - 1, memo) + cost[step - 1],
				minCostClimbingStairsHelper(cost, step - 2, memo) + cost[step - 2]);
		return memo[step];
	}
}
