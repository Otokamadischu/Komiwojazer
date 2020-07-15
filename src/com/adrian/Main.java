package com.adrian;

public class Main {

	public static void main(String[] args) {

		int[][] routesLengths;
		
		//Get routes lengths between cities
		Length length = new RouteLength();
		routesLengths = length.importLengthData("berlin52.txt");
		
		//Set random roads connection between all cities
		Komiwojazer komiwojazer = new Komiwojazer(routesLengths, routesLengths.length);
		komiwojazer.setRandomRoads(RouteRandom.random(komiwojazer.getNumberOfCities()));
		
		
		//Count sum of roads, shortest road (min), the longhest road (max)
		Count count = new CountRoad();
		
		komiwojazer.setSumOfRoads(count.count(komiwojazer.getRoutesLengths(), komiwojazer.getRandomRoads()));
		komiwojazer.setMaxSumOfRoads(count.getMax());
		komiwojazer.setMinSumOfRoads(count.getMin());
		
		
		
		

	}
}
