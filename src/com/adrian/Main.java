package com.adrian;

public class Main {

	public static void main(String[] args) {

		int[][] routesLengths;
		
		
		//Get routes lengths between cities
		routesLengths = RouteLength.importRoutesLengthsData("berlin52.txt");
		
		Komiwojazer komiwojazer = new Komiwojazer(routesLengths, routesLengths.length);

	}
}
