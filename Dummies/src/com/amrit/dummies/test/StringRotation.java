package com.amrit.dummies.test;

import java.util.Scanner;

/**
 * @author Einstein
 */
public class StringRotation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter String1: ");
		String str1 = scanner.next();
		
		System.out.print("Enter String2: ");
		String str2 = scanner.next();
		
		scanner.close();
		if(str1.length()>0 && str1.length() == str2.length()){
			String str = str1+str1;
			
			if(str.contains(str2)) {
				System.out.println("Rotational match");
			} else {
				System.out.println("Not a rotational match");
			}
		} else {
			System.out.println("Not a rotational match");
		}

	}

}
