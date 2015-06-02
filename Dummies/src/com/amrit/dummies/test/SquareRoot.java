package com.amrit.dummies.test;

public class SquareRoot {
	
	public double getSquareRoot(int num)
	{
		double guess = 1.0;
		
		for(int i=0; i<num; i++)
		{
			guess = 0.5 * (guess + num / guess);
		}
		
		return guess;
	}

}
