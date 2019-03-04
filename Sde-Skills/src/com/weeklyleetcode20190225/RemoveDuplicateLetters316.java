package com.weeklyleetcode20190225;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveDuplicateLetters316 {
	public String removeDuplicateLetters(String s) {
		if (s == null)
			return s;
		int inputLength = s.length();
		if (inputLength <= 0)
			return s;
		int[] count = new int[26];
		for (int index = 0; index < inputLength; index++) {
			count[s.charAt(index) - 'a']++;
		}
		boolean[] visited = new boolean[26];
		Deque<Character> stack = new ArrayDeque<>();
		for (int index = 0; index < inputLength; index++) {
			char currentChar = s.charAt(index);
			count[currentChar - 'a']--;
			if (visited[currentChar - 'a'])
				continue;
			while (!stack.isEmpty() && stack.peek() > currentChar && count[stack.peek() - 'a'] > 0) {
				visited[stack.pop() - 'a'] = false;
			}
			visited[currentChar - 'a'] = true;
			stack.push(currentChar);
		}
		StringBuilder sb = new StringBuilder();
		for (char currentChar : stack) {
			sb.insert(0, currentChar);
		}
		return sb.toString();
	}
}
