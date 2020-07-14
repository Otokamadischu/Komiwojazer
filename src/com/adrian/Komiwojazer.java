package com.adrian;

public class Komiwojazer {
	
	private int[][] routesLengths;
	private int numberOfCities;
	
	public Komiwojazer() {
		
	}
	
	public Komiwojazer(int[][] routesLengths, int numberOfCities) {
		this.routesLengths = routesLengths;
		this.numberOfCities = numberOfCities;
	}

	public int[][] getRoutesLengths() {
		return routesLengths;
	}

	public void setRoutesLengths(int[][] routesLengths) {
		this.routesLengths = routesLengths;
	}

	public int getNumberOfCities() {
		return numberOfCities;
	}

	public void setNumberOfCities(int numberOfCities) {
		this.numberOfCities = numberOfCities;
	}
	
	
	

}
