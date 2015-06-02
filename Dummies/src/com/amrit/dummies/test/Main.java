package com.amrit.dummies.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello world, def";
		
		String[] strArray = str.split(",");
		char[] chr1 = strArray[0].toCharArray();
		char[] chr2 = strArray[0].trim().toCharArray();
		
		String abc = strArray[0];
		
		for(int i=0; i<chr2.length; i++) {
			for(int j=0; j<chr1.length; j++) {
				if(chr2[i] == chr1[j]) {
					abc.replace(chr2[i], '*');
				}
			}
		}
		
		System.out.println(abc.toString());

	}

}
