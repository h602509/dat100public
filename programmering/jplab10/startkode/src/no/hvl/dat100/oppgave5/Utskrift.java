package no.hvl.dat100.oppgave5;

public class Utskrift {

	public static void SkrivUtKastTabell(Terning[] t) {

		System.out.println("Terningkast Simulator v0.1\n----------------------------");

		for (int i = 0; i < t.length; i++) {

			if (i % 10 == 0 && i != 0) {
				System.out.println();

			}

			System.out.print(t[i].getOyne() + "  ");

		}
		System.out.println("\n----------------------------\n");

	}

	
	public static void SkrivUtKastTabellStr(Terning[] t) {

		System.out.println("Terningkast Simulator v0.2\n");
		System.out.println("--------------------------------------------------------------------");
		
		
		for (int i = 0; i < t.length; i++) {

			if (i % 10 == 0 && i != 0) {
				System.out.println();

			}

			System.out.print(t[i].getOyneStr() + "  ");

		}
		System.out.println("\n--------------------------------------------------------------------\n");

	}

	
	public static void SkrivUtAntallUlikeOyne(Terning[] t) {

		System.out.println("Antall kast: " + t.length + "\n");

		for (int i = 0; i < 6; i++) {
			System.out.println("Antall " + (i + 1) + "-ere: " + Simulering.antallUlikeOyne(t)[i] + "\n");
		}

	}

	
	public static void SkrivUtAntallUlikeOyneStr(Terning[] t) {

		System.out.println("Antall kast: " + t.length + "\n");

		for (int i = 0; i < 6; i++) {
			System.out.println("Antall " + getOyneStr(i + 1) + "-ere: " + Simulering.antallUlikeOyne(t)[i] + "\n");
		}

	}
	
	
	public static void SkrivUtGjennomsnittKast(Terning[] t) {

		int sumAntallKast = 0;
		for (int i = 0; i < t.length; i++) {

			sumAntallKast = sumAntallKast + t[i].getOyne();
		}

		System.out.println("Gjennomsnittskast: " + sumAntallKast / (double) 100 + "\n");
	}

	public static void SkrivUtForsteKast(Terning[] t, int oyne) {
		int i = 0;
		while (t[i].getOyne() != oyne) {

			i++;

		}
		System.out.println("Antall kast til første " + oyne + "-er er: " + (i + 1) + "\n");
	}

	
	public static void SkrivUtForsteKastStr(Terning[] t, int oyne) {
		int i = 0;
		while (t[i].getOyne() != oyne) {

			i++;

		}
		System.out.println("Antall kast til første " + getOyneStr(oyne) + " er: " + (i + 1) + "\n");
	}
	
	
	public static void SkrivUtFlestAv(Terning[] t) {
		
		int størsteAntallKast = 0;
		int plasseringStørsteAntallKast = 0;
		
		for (int i = 0; i < Simulering.antallUlikeOyne(t).length; i++) {
			
			if (Simulering.antallUlikeOyne(t)[i] > størsteAntallKast) {
				størsteAntallKast = Simulering.antallUlikeOyne(t)[i];
				plasseringStørsteAntallKast = i + 1;
				
			}
			
		}
		System.out.println("Terningverdien det var kastet mest av var " + plasseringStørsteAntallKast);
	}

	
	public static void SkrivUtFlestAvStr(Terning[] t) {
		
		int størsteAntallKast = 0;
		int plasseringStørsteAntallKast = 0;
		
		for (int i = 0; i < Simulering.antallUlikeOyne(t).length; i++) {
			
			if (Simulering.antallUlikeOyne(t)[i] > størsteAntallKast) {
				størsteAntallKast = Simulering.antallUlikeOyne(t)[i];
				plasseringStørsteAntallKast = i + 1;
				
			}
			
		}
		System.out.println("Terningverdien det var kastet mest av var " + getOyneStr(plasseringStørsteAntallKast));
	}
	
	
	public static String getOyneStr(int o) {
		
		int caseNr = o;
		String oyne = "";
		
		switch (caseNr) {
		case 1:	oyne = "[ . ]";
		break;
		
		case 2: oyne = "[. .]";
		break;
		
		case 3: oyne = "[...]";
		break;
		
		case 4: oyne = "[: :]";
		break;
		
		case 5: oyne = "[:.:]";
		break;
		
		case 6: oyne = "[:::]";
		break;
		
		}
		
		return oyne;
		
	}
	
}
