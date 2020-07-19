package com.adrian;

public class TournamentSelection implements Selection {
	
	public int[][] selectBest(int[][] randomRoads, int[] sumOfRoads, int sizeOfTournament) {
		
		int length = sumOfRoads.length;
		int quantity;
		int shortestRoad;
		int[] bestRoads;
		int[][] roadsAfterTournament = new int[length][length];
		
		if(length%sizeOfTournament == 0)
			quantity = length/sizeOfTournament;
		else
			quantity = length;
		
		bestRoads = new int[quantity];
		
		//Finding shortest roads from individual parts of table (sumOfRoads)
		for(int x=0; x<quantity; x++)
		{
			shortestRoad = 0;
			for(int y=(x*sizeOfTournament); y<length; y++)
			{
				if(shortestRoad==0||shortestRoad>sumOfRoads[y]) {
					shortestRoad = sumOfRoads[y];
					
					//Which element in table sumOfRoads have shortest road, stores referring index numbers
					bestRoads[x] = y;
				}
			}
			
		}
		
		for(int x=0; x<quantity; x++)
			for(int j=0; j<sizeOfTournament; j++)
				for(int r=0; r<length; r++) {
					roadsAfterTournament[j+(x*sizeOfTournament)][r] = randomRoads[bestRoads[x]][r];
				}
					
		
		return roadsAfterTournament;
	}

}
