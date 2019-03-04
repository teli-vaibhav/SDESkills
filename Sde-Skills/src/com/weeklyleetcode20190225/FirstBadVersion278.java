package com.weeklyleetcode20190225;

public class FirstBadVersion278 {
	public int firstBadVersion(int n) {
		if (n < 1)
			return Integer.MIN_VALUE;
		int start = 1;
		int end = n;
		while (start <= end) {
			int mid = (end - start) / 2 + start;
			boolean isMidBad = isBadVersion(mid);
			if (isMidBad && (mid == 1 || !isBadVersion(mid - 1)))
				return mid;
			if (!isMidBad)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return Integer.MIN_VALUE;
	}
}
