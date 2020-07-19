package com.adrian;

public class CountRoad implements Count {
	
	private int min;
	
	public CountRoad() {
	}
	
	public int[] count(int[][] routesLengths, int[][] randomRoads){

		int numberOfCities = routesLengths.length;
		min=0;
		
		int[] totalRandomRoads = new int[numberOfCities];
		
	    for(int i=0; i<numberOfCities; i++) {
	    	
	    	totalRandomRoads[i]=0;
	    	
	    	//Summing roads connections between all cities
			for(int j=0; j<numberOfCities-1; j++) {

				totalRandomRoads[i] += routesLengths[randomRoads[i][j]][randomRoads[i][j+1]];
			}
			
			totalRandomRoads[i] += routesLengths[randomRoads[i][numberOfCities-1]][randomRoads[i][0]];
			
			if(totalRandomRoads[i]<min||min==0) {
				min = totalRandomRoads[i];
			}
			
		}
	    
	    return totalRandomRoads;
	}

	public int getMin() {
		return min;
	}
}
