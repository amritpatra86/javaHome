package com.amrit.dummies.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareRootTest {
	
	@Test
	public void testSquareRoot()
	{
		SquareRoot root = new SquareRoot();
		assertEquals(2.236, root.getSquareRoot(5), 0.001);
		System.out.println(root.getSquareRoot(5));
	}

}
