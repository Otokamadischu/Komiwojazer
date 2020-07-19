package com.adrian;

import java.util.Arrays;
import java.util.Random;

public class OrderCrossover implements Crossover {
	
	//We exchange parts of roads between two roads
	public int[][] crossover(int[][] randomRoads){
		
		int length = randomRoads.length;
		int sectionA;
		int sectionB;
		Random r = new Random();
		int tmp[][];
		
		for(int x=0; x<length; x+=2) {
			sectionA = r.nextInt(length -1);
			sectionB = r.nextInt(length - sectionA);
			sectionB += sectionA;
			
			//Store temporary two roads which will be crossed
			tmp = new int[2][length];
			for(int y=sectionA; y<=sectionB; y++)
			{
					tmp[0][y] = randomRoads[x][y];
					tmp[1][y] = randomRoads[x+1][y];
			}
			
			int tmpIndex;
			
			for(int z=sectionB+1; z<length+sectionA; z++) {
				
				if(z>=length)
					tmpIndex=z-length;
				else
					tmpIndex=z;
				
				while(Arrays.asList(tmp[0]).contains(randomRoads[x+1][tmpIndex])) {
					tmpIndex++;
					if(tmpIndex==length)
					{
						tmpIndex=0;
					}
				}

				tmp[0][tmpIndex] = randomRoads[x+1][tmpIndex];

				if(z>=length)
					tmpIndex=z-length;
				else
					tmpIndex=z;
				
				while(Arrays.asList(tmp[1]).contains(randomRoads[x][tmpIndex])) {
					tmpIndex++;
					if(tmpIndex==length)
					{
						tmpIndex=0;
					}
				}
				
				
				tmp[1][tmpIndex] = randomRoads[x][tmpIndex];
			}
			
			randomRoads[x] = tmp[0];
			randomRoads[x+1] = tmp[1];
		}
		return randomRoads;
	}

}
