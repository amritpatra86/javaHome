package com.amrit.dummies.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Einstein
 */
public class PermutedString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("String 1: ");
		String str1 = scanner.next();

		System.out.print("String 2: ");
		String str2 = scanner.next();
		
		scanner.close();
		
		if(sort(str1.toLowerCase()).equals(sort(str2.toLowerCase()))) {
			System.out.println("Permuted string");
		} else {
			System.out.println("Not permuted string");
		}
	}

	public static String sort(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
}
