package com.amrit.dummies.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FebonacciTest {
	
	@Test
	public void test()
	{
		Febonacci obj = new Febonacci();
		
		assertTrue(obj.isPresent(0));
		assertTrue(obj.isPresent(1));
		assertFalse(obj.isPresent(143));
		assertTrue(obj.isPresent(144));
	}

}
