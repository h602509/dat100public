package no.hvl.dat100.oppgave5;

import java.util.Random;

public class Terning {

	// aktuell verdi for terningen
	private int oyne;

	public Terning() {
		
		}

	public int getOyne() {

		return oyne;
	}
	
	public String getOyneStr() {
	
		int caseNr = oyne;
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
	
	
	public void trill() {
		
		Random rand = new Random();
		oyne = rand.nextInt(6)+1;

	}
	
}