package com.amrit.dummies.test;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class MachineChangeTest {
	
	@Test
	public void testReturnChange()
	{
		Map<Integer, Integer> changeMap = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		
		changeMap.put(25, 3);
		changeMap.put(10, 5);
		changeMap.put(1,3);
		
		//If change amount asked is more than the coins available, then distribute all that is available.
		assertEquals(128, MachineChange.returnChange(changeMap, 130));
		
		//If change amount asked can't be arrived with the available coins, then distribute as close to the change amount possible.
		assertEquals(98, MachineChange.returnChange(changeMap, 99));
		
		//If change amount asked can be arrived with the available coins
		assertEquals(62, MachineChange.returnChange(changeMap, 62));
	}

}
