package com.sdeskills.weeklyleetcode20190218;

public class ReversePairs493 {

	public int reversePairs(int[] nums) {
		if (nums == null || nums.length <= 0)
			return 0;
		return enhancedMergeSort(nums, 0, nums.length - 1);
	}

	private int enhancedMergeSort(int[] nums, int start, int end) {
		if (start >= end)
			return 0;

		int mid = (end - start) / 2 + start;
		int noOfReversePairs = enhancedMergeSort(nums, start, mid);
		noOfReversePairs += enhancedMergeSort(nums, mid + 1, end);
		noOfReversePairs += merge(nums, start, mid, end);
		return noOfReversePairs;
	}

	private int merge(int[] nums, int start, int mid, int end) {
		int[] temp1 = new int[mid - start + 1];
		int[] temp2 = new int[end - mid];
		int result = 0;

		for (int i = start, j = 0; i <= mid; i++) {
			temp1[j++] = nums[i];
		}

		for (int i = mid + 1, j = 0; i <= end; i++) {
			temp2[j++] = nums[i];
		}

		int i = 0;
		int j = 0;
		while (i < temp1.length && j < temp2.length) {
			long first = temp1[i];
			long second = temp2[j];

			if (first > second * 2) {
				result = result + (temp1.length - i);
				j++;
			} else {
				i++;
			}
		}

		i = 0;
		j = 0;
		int k = start;
		while (i < temp1.length && j < temp2.length) {

			if (temp1[i] < temp2[j])
				nums[k++] = temp1[i++];
			else
				nums[k++] = temp2[j++];
		}

		while (i < temp1.length) {
			nums[k++] = temp1[i++];
		}

		while (j < temp2.length) {
			nums[k++] = temp2[j++];
		}
		return result;
	}
}
