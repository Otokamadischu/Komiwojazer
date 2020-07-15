package com.adrian;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RouteLength implements Length {

	
	public int[][] importLengthData(String path) {
		
		int[][] routeLengths = null;

		File file = new File(path);
		try {
			Scanner skaner = new Scanner(file);
			int size = skaner.nextInt();
			routeLengths = new int[size][size];

			while (skaner.hasNextInt()) {

				for (int i = 0; i < size; i++) {
					for (int j = 0; j <= i; j++) {
						routeLengths[i][j] = skaner.nextInt();
						routeLengths[j][i] = routeLengths[i][j];
					}
				}
			}
			skaner.close();

		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find file: " + path);
		}
		
		return routeLengths;
	}
}
