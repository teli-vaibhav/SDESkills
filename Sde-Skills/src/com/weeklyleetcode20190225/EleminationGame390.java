package com.weeklyleetcode20190225;

public class EleminationGame390 {
	public int lastRemaining(int n) {
		if (n <= 1)
			return 1;
		int start = 1;
		int next = 2;
		boolean isLeftToRight = true;
		int remaining = n;

		while (remaining > 1) {
			if (isLeftToRight) {
				int tempNext = next + (next - start) * 2;
				start = next;
				next = tempNext;
				remaining = remaining / 2;
				isLeftToRight = false;
			} else {
				if (remaining % 2 != 0) {
					int tempNext = next + (next - start) * 2;
					start = next;
					next = tempNext;
				} else {
					int tempNext = start + (next - start) * 2;
					next = tempNext;
				}
				remaining = remaining / 2;
				isLeftToRight = true;
			}
		}
		return start;
	}
}
