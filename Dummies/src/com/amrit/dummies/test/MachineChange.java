package com.amrit.dummies.test;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MachineChange {
	
	public static void main(String args[])
	{
		Map<Integer, Integer> changeMap = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		changeMap.put(25, 3);
		changeMap.put(10, 5);
		changeMap.put(1, 3);
		
		System.out.print("Please enter the change amount : ");
		Scanner in = new Scanner(System.in);
		int change = in.nextInt();
		
		System.out.println("Total change returned : " + returnChange(changeMap, change));
	}
	
	public static int returnChange(Map<Integer, Integer> changeMap, int change )
	{
		int totalChangeAvailable = 0;
		int changeReturned = 0;
		for(Map.Entry<Integer, Integer> entry : changeMap.entrySet())
		{
			totalChangeAvailable += entry.getKey() * entry.getValue();
		}
		
		if(change > totalChangeAvailable)
		{
			changeReturned = totalChangeAvailable;
		}
		else
		{
			for(Map.Entry<Integer, Integer> entry : changeMap.entrySet())
			{
				if(change > 0)
				{
					if(entry.getKey()*entry.getValue() < change)
					{
						changeReturned += entry.getKey()*entry.getValue();
						change -= changeReturned;
					}
					else
					{
						changeReturned += (change/entry.getKey()) * entry.getKey();
						change = change % entry.getKey();
					}
				}
			}
		}
		
		return changeReturned;
	}
		
}
