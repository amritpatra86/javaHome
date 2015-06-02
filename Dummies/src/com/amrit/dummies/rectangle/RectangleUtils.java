package com.amrit.dummies.rectangle;

import java.util.Arrays;


public class RectangleUtils {
		
	/**
	 * Calculates the area of overlap of two (2) {@link Rectangle}s.
	 * 
	 * @param r1 first rectangle
	 * @param r2 second rectangle
	 * @return
	 */
	public double getAreaOfOverlap(Rectangle r1, Rectangle r2) {
		
		//double areaOfR1 = (r1.getNorthEast().x - r1.getSouthWest().x) * (r1.getNorthEast().y - r1.getSouthWest().y);
		//double areaOfR2 = (r2.getNorthEast().x - r2.getSouthWest().x) * (r2.getNorthEast().y - r2.getSouthWest().y);
		
		double areaOfOverlap;
		
		double[] xCoordinates = {r1.getNorthEast().x, r1.getSouthWest().x, r2.getNorthEast().x, r2.getSouthWest().x};
		double[] yCoordinates = {r1.getNorthEast().y, r1.getSouthWest().y, r2.getNorthEast().y, r2.getSouthWest().y};
		
		Arrays.sort(xCoordinates);
		Arrays.sort(yCoordinates);
		
		double lengthOfOverlappingRect = xCoordinates[2] - xCoordinates[1];
		double widthOfOverlappingRect = yCoordinates[2] - yCoordinates[1];
		
		if(lengthOfOverlappingRect != 0 && widthOfOverlappingRect != 0)
			areaOfOverlap = lengthOfOverlappingRect * widthOfOverlappingRect;
		else
			areaOfOverlap = 0;
			
		return areaOfOverlap;
	}
	
	/**
	 * Calculates the distance between the centers of two (2) {@link Rectangle}s.
	 * @param r1 first rectangle
	 * @param r2 second rectangle
	 * @return
	 */
	public double getDistance(Rectangle r1, Rectangle r2) {
		
		Coordinate centerOfR1 = new Coordinate((r1.getNorthEast().x+r1.getSouthWest().x)/2, (r1.getNorthEast().y+r1.getSouthWest().y)/2);
		Coordinate centerOfR2 = new Coordinate((r2.getNorthEast().x+r2.getSouthWest().x)/2, (r2.getNorthEast().y+r2.getSouthWest().y)/2);
		
		double distance = Math.sqrt(Math.pow(centerOfR1.x-centerOfR2.x, 2) + Math.pow(centerOfR1.y-centerOfR2.y, 2));
		return distance;
	}
	
	/**
	 * Calculates the centroid (average of all center points) of given rectangles
	 * @param rs rectangles of 
	 * @return {@link Coordinate} representation of the centroid
	 */
	public Coordinate getCentroid(Rectangle... rects) {
		
		float sumX = 0;
		float sumY = 0;
		
		for(Rectangle rect : rects)
		{
			sumX += (rect.getNorthEast().x + rect.getSouthWest().x)/2;
			sumY += (rect.getNorthEast().y + rect.getSouthWest().y)/2;
		}
		
		return new Coordinate(sumX/rects.length, sumY/rects.length);
	}
	
}
