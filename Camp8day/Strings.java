package com.timejh;

public class Strings {

	public static void main(String[] args) {
		
		String a = "123494";
		String b = "43224";
		String c = a;
		// 1. 문자열 비교
		//   문자열.compareTo(문자열)
		//   문자열.equals(문자열)
		//   문자열 == 문자열

		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));

		System.out.println(a.equals(b));
		System.out.println(a.equals(c));

		System.out.println(a == b);
		System.out.println(a == c);
		
	}

}

