package com.adrian;

public class CountRoad implements Count {
	
	private int max;
	private int min;
	
	public CountRoad() {
		this.max = 0;
		this.min = 0;
	}
	
	public CountRoad(int max, int min) {
		this.max = max;
		this.min = min;
	}
	
	public int[] count(int[][] routesLengths, int[][] randomRoads){

		int numberOfCities = routesLengths.length;
		
		int[] totalRandomRoads = new int[numberOfCities];
		
	    for(int i=0; i<numberOfCities; i++) {
	    	
	    	totalRandomRoads[i]=0;
	    	
	    	//Summing roads connections between all cities
			for(int j=0; j<numberOfCities-1; j++) {

				totalRandomRoads[i] += routesLengths[randomRoads[i][j]][randomRoads[i][j+1]];
			}
			
			totalRandomRoads[i] += routesLengths[randomRoads[i][numberOfCities-1]][randomRoads[i][0]];
			
			if(totalRandomRoads[i]>max) {
				max = totalRandomRoads[i];
			}

			if(totalRandomRoads[i]<min || min==0) {
				min = totalRandomRoads[i];
			}
		}
	    
	    return totalRandomRoads;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	

}
