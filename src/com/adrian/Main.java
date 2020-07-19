package com.adrian;

public class Main {

	public static void main(String[] args) {

		int[][] routesLengths;
		
		Selection selection = new TournamentSelection();
		Crossover crossover = new OrderCrossover();	
		Mutation mutation = new InversionMutation();
		RouteRandom routeRandom  = new RouteRandom();
		Count count = new CountRoad();
		
		//Get routes lengths between cities
		Length length = new RouteLength();
		routesLengths = length.importLengthData("berlin52.txt");
		
		//Set random roads connection between all cities
		Komiwojazer komiwojazer = new Komiwojazer(routesLengths, routesLengths.length);
		komiwojazer.setRandomRoads(routeRandom.random(komiwojazer.getNumberOfCities()));
		
		//Set random roads before loop starts
		komiwojazer.setSumOfRoads(count.count(komiwojazer.getRoutesLengths(), komiwojazer.getRandomRoads()));
		count.count(komiwojazer.getRoutesLengths(), komiwojazer.getRandomRoads());
		
		for(int x=0; x<100000; x++) {
			
			//Selection best roads
			komiwojazer.setRandomRoads(
					//number of cities should be divisible by last argument in method selectBest
					selection.selectBest(komiwojazer.getRandomRoads(), komiwojazer.getSumOfRoads(), (komiwojazer.getNumberOfCities()/2))
					);
			
			//Crossover roads
			komiwojazer.setRandomRoads(crossover.crossover(komiwojazer.getRandomRoads()));
			
			//Mutate roads
			komiwojazer.setRandomRoads(mutation.mutate(komiwojazer.getRandomRoads()));
			
			//Count sum of roads
			komiwojazer.setSumOfRoads(count.count(komiwojazer.getRoutesLengths(), komiwojazer.getRandomRoads()));
			
			//Check if we have new best roud
			if(count.getMin()<komiwojazer.getBestRoad()||komiwojazer.getBestRoad()==0)
				komiwojazer.setBestRoad(count.getMin());
		}
		System.out.println(komiwojazer.getBestRoad());
	
		
	}
}
