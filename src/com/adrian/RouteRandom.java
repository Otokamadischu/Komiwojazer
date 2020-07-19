package com.adrian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RouteRandom implements Random {
	
	public int[][] random(int numberOfCities){

		List<Integer> list = new ArrayList<Integer>();
		int[][] randomRoads = new int[numberOfCities][numberOfCities];
		
		for (int i = 0; i < numberOfCities; i++) {
			list.add(i);
		}
	
		for (int i = 0; i < numberOfCities; i++) {
			Collections.shuffle(list);
			for (int j = 0; j < numberOfCities; j++) {
				randomRoads[i][j] = list.get(j);
			}
		}
		
		return randomRoads;
	}
}
