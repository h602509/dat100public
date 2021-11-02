package no.hvl.dat100.oppgave4;

import java.util.Arrays;

public class MiniExcel {

	private static int[][] data = { 	
			{ 1, 2, 1, 0 }, 
			{ 3, 4, 1, 0 },
			{ 5, 6, 1, 0 },
			{ 5, 6, 1, 0 },
			{ 0, 0, 0, 0 } 
			
	};

	public static void skrivUt() {

		System.out.println("-----");

		for (int rad = 0; rad < data.length; rad++) {
			for (int kol = 0; kol < data[rad].length; kol++) {
				System.out.print(data[rad][kol] + " ");
				
			}
			System.out.println();
			
		}

		System.out.println("-----");
	}

	public static void beregnSum() {

		int sumRad = 0;

		
		for (int rad = 0; rad < data.length - 1; rad++) {
			for (int kol = 0; kol < data[rad].length - 1; kol++) {
				
				sumRad = sumRad + data[rad][kol];
				
			}
			data[rad][data[rad].length - 1] = sumRad;
			sumRad = 0;
		}
			
		int sumKol = 0;

		for (int kol = 0; kol < data[0].length - 1; kol++) {
			for (int rad = 0; rad < data.length; rad++) {
				sumKol = sumKol + data[rad][kol];
				
			}
			data[data.length-1][kol] = sumKol;
			sumKol = 0;
		}

	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}
