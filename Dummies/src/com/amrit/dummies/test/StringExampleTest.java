package com.amrit.dummies.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class StringExampleTest {
	
	@Test
	public void testFindOccurance()
	{
		StringExample obj = new StringExample();
		String text = "Hello this is amrit hello from this is hello from suprit";
		
		HashMap<String, Integer> wordMap = obj.findOccurance(text);
		
		assertEquals(3, wordMap.get("hello").intValue());
		
		assertFalse(wordMap.get("amrit").intValue() == 2);
	}

}
