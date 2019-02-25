package com.sdeskills.weeklyleetcode20190218;

public class GuessNumberHigherOrLowerIIRecursive375 {

	public int getMoneyAmount(int n) {
		if (n <= 1)
			return 0;
		return getMoneyAmountHelper(1, n);
	}

	private int getMoneyAmountHelper(int start, int end) {
		if (start >= end)
			return 0;
		int result = Integer.MAX_VALUE;
		for (int index = start; index <= end; index++) {
			int currentRes = Math.max(index + getMoneyAmountHelper(start, index - 1),
					index + getMoneyAmountHelper(index + 1, end));
			result = Math.min(result, currentRes);
		}
		return result;
	}
}
