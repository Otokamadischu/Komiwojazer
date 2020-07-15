package com.adrian;

public class Komiwojazer {
	
	private int[][] routesLengths;
	private int numberOfCities;
	private int[][] randomRoads;
	private int[] sumOfRoads;
	private int maxSumOfRoads;
	private int minSumOfRoads;
	
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

	public int[][] getRandomRoads() {
		return randomRoads;
	}

	public void setRandomRoads(int[][] randomRoads) {
		this.randomRoads = randomRoads;
	}

	public int[] getSumOfRoads() {
		return sumOfRoads;
	}

	public void setSumOfRoads(int[] sumOfRoads) {
		this.sumOfRoads = sumOfRoads;
	}

	public int getMaxSumOfRoads() {
		return maxSumOfRoads;
	}

	public void setMaxSumOfRoads(int maxSumOfRoads) {
		this.maxSumOfRoads = maxSumOfRoads;
	}

	public int getMinSumOfRoads() {
		return minSumOfRoads;
	}

	public void setMinSumOfRoads(int minSumOfRoads) {
		this.minSumOfRoads = minSumOfRoads;
	}


	
	
	

}
