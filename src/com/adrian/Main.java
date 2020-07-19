package com.adrian;

public class Main {

	public static void main(String[] args) {

		int[][] routesLengths;
		
		//Get routes lengths between cities
		Length length = new RouteLength();
		routesLengths = length.importLengthData("berlin52.txt");
		
		//Set random roads connection between all cities
		Komiwojazer komiwojazer = new Komiwojazer(routesLengths, routesLengths.length);
		RouteRandom routeRandom  = new RouteRandom();
		komiwojazer.setRandomRoads(routeRandom.random(komiwojazer.getNumberOfCities()));
		
		
		//Count sum of roads
		Count count = new CountRoad();
		komiwojazer.setSumOfRoads(count.count(komiwojazer.getRoutesLengths(), komiwojazer.getRandomRoads()));


		Selection selection = new TournamentSelection();
		komiwojazer.setRandomRoads(
				//number of cities should be divisible by last argument in method selectBest
				selection.selectBest(komiwojazer.getRandomRoads(), komiwojazer.getSumOfRoads(), (komiwojazer.getNumberOfCities()/2))
				);
		
	}
}
