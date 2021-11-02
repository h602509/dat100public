package no.hvl.dat100.oppgave4;

import java.util.Arrays;

public class MiniExcel {

	private static int[][] data = { 	
			{ 1, 2, 0 }, 
			{ 3, 4, 0 },
			{ 5, 6, 0 }, 
			{ 0, 0, 0 } 
			
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

		// TODO - START

		// for hver rad (med unntak av siste rad) summer elementene 
		// og skriv summen i den siste posisjonen for den aktuelle raden

		// TODO - END

		// TODO - START

		// for hver kolonne (med unntak av siste kolonne) summer elementene 
		// og skriv summen i siste rad i posisjonen svarende til den aktuelle kolonnen
		
		// TODO - END

	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}
}
