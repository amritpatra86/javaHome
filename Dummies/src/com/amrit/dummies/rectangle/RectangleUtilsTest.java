package com.amrit.dummies.rectangle;

import org.junit.Before;
import org.junit.Test;

public class RectangleUtilsTest {
	
	RectangleUtils utils;
	Rectangle r1;
	Rectangle r2;
	
	@Before
	public void setUp()
	{
		r1 = new Rectangle();
		r2 = new Rectangle();
		
		r1.setNorthEast(new Coordinate(10, 9));
		r1.setSouthWest(new Coordinate(2, 5));
		
		r2.setNorthEast(new Coordinate(12, 7));
		r2.setSouthWest(new Coordinate(4, 1));
		
		//r2=r1;
		
		utils = new RectangleUtils();
		
	}
	
	@Test
	public void testGetAreaOfOverlap()
	{
		System.out.println(utils.getAreaOfOverlap(r1, r2));
	}
	
	@Test
	public void testGetDistance()
	{
		System.out.println(utils.getDistance(r1, r2));
	}
	
	@Test
	public void testGetCentroid()
	{
		Coordinate centroid = utils.getCentroid(r1, r1, r1);
		System.out.println(centroid.x);
		System.out.println(centroid.y);
	}

}
