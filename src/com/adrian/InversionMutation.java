package com.adrian;

import java.util.Random;

public class InversionMutation implements Mutation {

	public int[][] mutate(int[][] randomRoads){
		
		int length = randomRoads.length;
		int start;
		int end;
		int tmp;
		
		Random r = new Random();
		
		for (int x=0; x<length-1; x++) 
		{
			start = r.nextInt(length -1);
			end = r.nextInt(length - start);
			end += start;

			for (int y = start; y <= end; y++) {
				
				tmp = randomRoads[x][y];
				randomRoads[x][y] = randomRoads[x][end];
				randomRoads[x][end] = tmp;
				if(end>0)
					end--;
			}
		}
		return randomRoads;
	}
}
