package com.sdeskills.weeklyleetcode20190218;

public class GuessNumberHigherOrLowerIITopDown375 {
	public int getMoneyAmount(int n) {
		if (n <= 1)
			return 0;
		Integer[][] memo = new Integer[n + 1][n + 1];
		return getMoneyAmountHelper(1, n, memo);
	}

	private int getMoneyAmountHelper(int start, int end, Integer[][] memo) {
		if (start >= end)
			return 0;
		if (memo[start][end] != null)
			return memo[start][end];
		int result = Integer.MAX_VALUE;
		for (int index = start; index <= end; index++) {
			int currentRes = Math.max(index + getMoneyAmountHelper(start, index - 1, memo),
					index + getMoneyAmountHelper(index + 1, end, memo));
			result = Math.min(result, currentRes);
		}
		memo[start][end] = result;
		return result;
	}
}
