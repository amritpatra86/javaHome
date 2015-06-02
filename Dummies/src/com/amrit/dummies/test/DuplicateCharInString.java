package com.amrit.dummies.test;

import java.util.Arrays;

/**
 * @author Einstein
 *
 */
public class DuplicateCharInString {

	public static void main(String[] args) {

		String str = "ab@ch@";
		char[] arr;
		boolean duplicate = false;
		
		if(str != null) {
			arr = str.toCharArray();
			if(arr.length <= 1) {
				System.out.println("Empty String");
			} else {
				Arrays.sort(arr);
				
				for(int i=0; i<=arr.length-2; i++) {
					if(arr[i] == arr[i+1]) {
						duplicate = true;
						break;
					}
				}
				
				if(duplicate) {
					System.out.println("Duplicate present");
				} else {
					System.out.println("Duplicate not present");
				}
			}
		} else {
			System.out.println("Invalid String");
		}
		
	}

}
