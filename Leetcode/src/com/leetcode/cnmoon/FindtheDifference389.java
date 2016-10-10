package com.leetcode.cnmoon;

public class FindtheDifference389 {
	static public char findTheDifference(String s, String t) {
		int num = 0;
		char[] sarr = s.toCharArray();
		char[] tarr = t.toCharArray();
		for (int i = 0; i < sarr.length; i++) {
			num ^= sarr[i] + 0;
		}
		for (int i = 0; i < tarr.length; i++) {
			num ^= tarr[i] + 0;
		}
		return (char) num;
	}

	public static void main(String[] args) {
		char res = findTheDifference("abcd", "daceb");
		System.out.println(res);
	}
}
