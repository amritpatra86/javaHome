package com.amrit.dummies.test;

import java.util.Scanner;

/**
 * @author Einstein
 */
public class StringCompression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = scanner.next();
		
		scanner.close();
		
		StringBuilder br = new StringBuilder();
		char last = str.charAt(0);
		int charCount = 1;
		for(int i=1; i<str.length(); i++) {
			
			if(last == str.charAt(i)) {
				charCount++;
			} else {
				br.append(last);
				br.append(charCount);
				last = str.charAt(i);
				charCount = 1;
			}
		}
		
		br.append(last);
		br.append(charCount);
		
		if(br.toString().length() > str.length())
			System.out.println(str);
		else
			System.out.println(br.toString());

	}

}
