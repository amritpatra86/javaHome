package com.amrit.dummies.test;

import java.util.HashMap;

public class StringExample {
	
	public HashMap<String, Integer> findOccurance(String text)
	{
		String[] list = text.toLowerCase().split("\\s+");
		
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		
		for(String str : list)
		{
			if(wordMap.containsKey(str))
				wordMap.put(str, wordMap.get(str)+1);
			else
				wordMap.put(str, 1);
		}
		
		return wordMap;
	}

}
